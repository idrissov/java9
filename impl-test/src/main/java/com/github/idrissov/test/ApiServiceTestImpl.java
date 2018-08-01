package com.github.idrissov.test;

import com.github.idrissov.ApiService;

public class ApiServiceTestImpl implements ApiService {

    static {
        System.out.println("loading " + ApiServiceTestImpl.class.getName());
    }

    public ApiServiceTestImpl() {
        System.out.println("instantiation " + ApiServiceTestImpl.class.getName());
    }

    @Override
    public void printMessage(String message) {
        System.out.println("Test implementation: " + message);
    }
}
