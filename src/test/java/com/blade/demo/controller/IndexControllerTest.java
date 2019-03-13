package com.blade.demo.controller;

import com.blade.demo.BaseTest;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Test;

public class IndexControllerTest extends BaseTest {

    @Test
    public void indexTest() throws UnirestException {
        int statusCode = Unirest.get("http://127.0.0.1:9000/").asString().getStatus();
        System.out.println("statusCode = " + statusCode);
    }

    @Test
    public void testDetail() throws UnirestException {
        String body = Unirest.get("http://127.0.0.1:9000/info").asString().getBody();
        System.out.println("body = " + body);
    }

}
