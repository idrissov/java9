package com.github.idrissov.prod;

import com.github.idrissov.ApiService;

public class ApiServiceProdImpl implements ApiService {

    static {
        System.out.println("loading " + ApiServiceProdImpl.class.getName());
    }

    public ApiServiceProdImpl() {
        System.out.println("instantiation " + ApiServiceProdImpl.class.getName());
    }

    @Override
    public void printMessage(String message) {
        System.out.println("Production:" + message);
    }
}
