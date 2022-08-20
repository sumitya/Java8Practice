package com.example.anonym_func.realexamples.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (Integer integer) -> {
            if(integer%2 ==0) return true;
            else return false;
        };
        System.out.println(predicate.test(3));

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(predicate).forEach(t -> System.out.println(t));

        list
        .stream()
        .filter((Integer integer) -> {
            if(integer%2 ==0) return true; else return false;}
        )
        .forEach(t -> System.out.println(t));

        /**
        Predicate<Integer> predicate = new PredicateDemo();
        System.out.println(predicate.test(3));
         */
    }

    /**
    @Override
    public boolean test(Integer integer) {
        if(integer%2 ==0) return true;
        else return false;
    }
    */
}
