package com.blade.demo.controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Request;
import com.blade.mvc.http.Response;

@Path
public class IndexController {

    @GetRoute
    public void index(Request request, Response response) {
        response.text("Hello to index");
    }

    @GetRoute("info")
    public void info(Request request, Response response) {
        response.text("this is info");
    }

    @GetRoute("test")
    public void test(Request request, Response response) {
        response.text("this is info");
    }

}
