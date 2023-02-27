package ru.myitlesson;

import com.google.gson.Gson;
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
import java.util.Map;

public class MyItLessonAPI {
    public static final String URL = "https://myitlesson.ru";

    private final CloseableHttpClient httpClient;
    private final String token;

    public MyItLessonAPI(String name, String password) throws IOException {
        httpClient = HttpClients.createDefault();

        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("name", name));
        params.add(new BasicNameValuePair("password", password));

        Gson gson = new Gson();
        Map<?, ?> map = gson.fromJson(sendPost("token", params, false), Map.class);

        token = (String) map.get("token");
    }

    public String sendPost(String url, List<NameValuePair> params, boolean tokenNeeded) throws IOException {
        final HttpPost httpPost = new HttpPost(URL + "/" + url);

        if(tokenNeeded) {
            params.add(new BasicNameValuePair("token", token));
        }

        httpPost.setEntity(new UrlEncodedFormEntity(params));

        return httpClient.execute(httpPost, response -> {
            final HttpEntity httpEntity = response.getEntity();
            String responseStr = EntityUtils.toString(httpEntity, StandardCharsets.UTF_8);
            EntityUtils.consume(httpEntity);

            return responseStr;
        });
    }
}