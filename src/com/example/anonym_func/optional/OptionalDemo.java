package com.example.anonym_func.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class OptionalDemo {

    public static void main(String[] args) throws Exception {

        Customer customer=
                new Customer(101, "somename", "test@gmail.com", Arrays.asList("397937955", "21654725"));

        /** Ways to create Optional
         *  empty
            of
            ofNullable
        */

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //Optional<String> emailOptional = Optional.of(customer.getEmail()); //it returns NPE in case of null
        //System.out.println(emailOptional);

        Optional<Integer> idOptional2 = Optional.ofNullable(customer.getId()); //it doesn't returns NPE in case of null
        Optional<String> nameOptional = Optional.ofNullable(customer.getName());
        if(nameOptional.isPresent()){
            System.out.println(nameOptional.get());
        }
       System.out.println(nameOptional.orElse("Default Name"));

       System.out.println(nameOptional.orElseThrow(()->new IllegalArgumentException("name not present")));

        System.out.println(nameOptional.map(String::toUpperCase).orElseGet(()->"default name..."));

        getCustomerByEmailId("pqr");
    }
    public static Customer getCustomerByEmailId(String email) throws Exception {
        List<Customer> customers = EkartDataBase.getAll();
        return customers.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny().orElseThrow(()->new Exception("no customer present with this email id"));

    }
}
