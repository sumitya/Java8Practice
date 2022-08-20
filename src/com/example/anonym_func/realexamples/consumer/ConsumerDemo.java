package com.example.anonym_func.realexamples.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (t) -> System.out.println("Printing  : " + t);
        consumer.accept(10);

        //Usage of forEach with Consumer Functional interface.
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach(consumer);
        list.forEach((t) -> System.out.println("Printing  : " + t));

    }
}
