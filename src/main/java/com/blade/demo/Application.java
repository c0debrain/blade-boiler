package com.blade.demo;

import com.blade.Blade;

public class Application {

    public static void main(String[] args) {
        Blade.of().start(Application.class, args);
        //Blade.of().get("/", ctx -> ctx.text("Hello World how are you")).start(HelloApplication.class, args);
    }

}
