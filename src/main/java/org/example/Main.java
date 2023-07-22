package org.example;

public class Main {
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(1,2);
        ComplexNum num2 = new ComplexNum(3,4);
        ComplexCalculator calculator = new ComplexCalculator();
        System.out.println("calculator.sum(num1,num2) = " + calculator.sum(num1, num2));
        System.out.println("calculator.subtraction(num1,num2) = " + calculator.subtraction(num1, num2));
        System.out.println("calculator.multiple(num1,num2) = " + calculator.multiple(num1, num2));
        System.out.println("calculator.division(num1,num2) = " + calculator.division(num1, num2));
    }
}