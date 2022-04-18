package com.integrapass;

import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static final List<String> list = new ArrayList<>();

    public static void main(String... args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result(list.toString()));
        app.post("/pay", ctx -> {
            list.add(ctx.body());
        });
    }

}
