package com.example.anonym_func.realexamples.book.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

         Supplier<String> supplier = () ->  "No String Found!";
         System.out.println(supplier.get());

        List<String> list = Arrays.asList();
        list.stream().findAny().orElseGet(supplier);
        /**
        Supplier<String> supplier = new SupplierDemo();
        System.out.println(supplier.get());
         */
    }
    /**
    @Override
    public Object get() {
        return "Hello World!";
    }
    */



}
