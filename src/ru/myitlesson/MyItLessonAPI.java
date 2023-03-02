package ru.myitlesson;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.BasicNameValuePair;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MyItLessonAPI {
    public static final String URL = "https://myitlesson.ru";

    private final CloseableHttpClient httpClient;
    private final String token;

    public MyItLessonAPI(String name, String password) throws IOException, APIException {
        httpClient = HttpClients.createDefault();

        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("name", name));
        params.add(new BasicNameValuePair("password", password));

        token = sendPost("token", params, JsonObject.class).getAsJsonPrimitive("token").toString();
    }

    public <T> T sendPost(String url, List<NameValuePair> params, Class<T> tClass) throws IOException, APIException {
        final HttpPost httpPost = new HttpPost(URL + "/" + url);

        httpPost.setEntity(new UrlEncodedFormEntity(params));

        return httpClient.execute(httpPost, response -> {
            final Gson gson = new Gson();
            final HttpEntity httpEntity = response.getEntity();

            String responseStr = EntityUtils.toString(httpEntity, StandardCharsets.UTF_8);
            EntityUtils.consume(httpEntity);

            JsonObject jsonObject = gson.fromJson(responseStr, JsonObject.class);
            JsonPrimitive jsonString = jsonObject.getAsJsonPrimitive("err");

            if(jsonString != null) {
                throw new APIException(jsonString.toString());
            }

            return gson.fromJson(jsonObject, tClass);
        });
    }

    public <T> T sendPostWithToken(String url, List<NameValuePair> params, Class<T> tClass) throws IOException, APIException {
        params.add(new BasicNameValuePair("token", token));
        return sendPost(url, params, tClass);
    }
}