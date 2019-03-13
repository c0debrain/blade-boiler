package com.blade.demo.controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Request;
//import com.blade.mvc.http.Response;

@Path
public class Authenticate {

    @GetRoute("sign-up")
    public String signup(Request request) {
        //response.text("Hello to index");
        return "index";
    }

    @GetRoute("sign-in")
    public String signin(Request request) {
        //response.text("Hello to index");
        return "index";
    }

}
