package com.github.idrissov.executor;

import com.github.idrissov.ApiService;
import java.util.Scanner;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose implementation (prod or test):");
            String implementation = scanner.nextLine();

            System.out.println("Write message:");
            String message = scanner.nextLine();
            ServiceLoader.load(ApiService.class)
                .stream()
                .filter(t -> t.type().getName().contains(implementation))
                .map(Provider::get)
                .forEach(service -> service.printMessage(message));

            System.out.println("Do you want continue (y/n)");
        } while (!"y".equalsIgnoreCase(scanner.nextLine()));
    }
}
