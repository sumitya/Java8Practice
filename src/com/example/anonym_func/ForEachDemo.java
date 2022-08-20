package com.example.anonym_func;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Murrit");
        list.add("john");
        list.add("piter");
        list.add("marek");
        list.add("mac");

        list.stream().filter(s -> s.startsWith("m")).forEach(t -> System.out.println(t));

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        //forEach method on map has BiConsumer i.e. it takes two argeuemnts
        map.forEach((key, value) ->  System.out.println(key +": "+value));
        map.entrySet().stream().forEach(obj -> System.out.println(obj));

        Consumer<String> consumer = t -> System.out.println(t);
        consumer.accept("TestString");
    }

}
