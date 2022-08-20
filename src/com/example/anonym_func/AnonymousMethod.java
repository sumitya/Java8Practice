package com.example.anonym_func;

interface Calc {
    void switchOn();
}
interface SumCalc {
    void sum(int input1,int input2);
}
interface MultiplyCalc {
    int multiply(int input1,int input2);
}
public class AnonymousMethod {
    public static void main(String[] args) {
        // Since only one abstract method is there in interface(functional interface).
        // we can create anonymous method for such interfaces.
        Calc calc = () -> System.out.println("Switch On!");
        calc.switchOn();

        SumCalc sumCalc = (int input1,int input2) -> {
            int res = input1 + input2;
            System.out.println("Sum: "+res);
        };
        sumCalc.sum(4,8);
        MultiplyCalc multiplyCalc = (int input1, int input2) -> {
            return input1 * input2;
            //return 1;
        };
        System.out.println("Multiply: "+multiplyCalc.multiply(3,2));
    }
}
