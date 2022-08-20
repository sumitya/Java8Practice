package com.example.anonym_func;

//Comparator ,Runnable, Callable, Comparable - these all are Functional interfaces.
// Consumer, Predicate, Supplier are speical Functional interfaces
@FunctionalInterface
public interface CustomFunctionalnterface {

    void m1();
    default void m2() {
        System.out.println("Default m2");
    }
    //void m3();
    static void m4() {
        System.out.println("Default m4");
    }
}
