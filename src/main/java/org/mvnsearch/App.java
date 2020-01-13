package org.mvnsearch;

import org.mvnsearch.internal.InternalService;

public class App {
    public static void main(String[] args) {
        Object text = ReflectionUtils.invokeMethod("Welcome Jackie!", "length");
        System.out.println(text);
        boolean demo = InternalService.isVip("demo");
    }
}
