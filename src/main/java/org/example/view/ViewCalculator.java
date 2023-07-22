package org.example.view;

import org.example.controller.ComplexCalculator;
import org.example.module.ComplexNum;

import java.util.Scanner;

public class ViewCalculator {

    private String choice(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }


    private double setNums1(){
        Scanner firstNumIn = new Scanner(System.in);
        System.out.println("Комплексное число вида z = a +bi");
        System.out.println("Введите вещественное число 'a': ");
        double firstNum = firstNumIn.nextDouble();
        return firstNum;
    }
    private double setNums2(){
        Scanner firstNumIn = new Scanner(System.in);
        System.out.println("Комплексное число вида z = a +bi");
        System.out.println("Введите вещественное число 'b': ");
        double secondNum = firstNumIn.nextDouble();
        return secondNum;
    }

    public void run(){
        while (true){
            System.out.println("Вводим 1-е комплексное число: ");
            ComplexNum num1 = new ComplexNum(setNums1(), setNums2());
            System.out.println("Вводим 2-е комплексное число: ");
            ComplexNum num2 = new ComplexNum(setNums1(),setNums2());
            ComplexCalculator calculator = new ComplexCalculator(num1,num2);
            while (true){
                String cmd = choice("Введите команду (+, -, *, /)");
                if (cmd.equals("+")){
                    System.out.println(calculator.sum());
                    break;
                }
                if (cmd.equals("-")){
                    System.out.println(calculator.subtraction());
                    break;
                }
                if (cmd.equals("*")){
                    System.out.println(calculator.multiple());
                    break;
                }
                if (cmd.equals("/")){
                    System.out.println(calculator.division());
                    break;
                }

            }
            String cmd = choice("Еще считаем (Y/N)?");
            if (cmd.equals("Y")){
                continue;
            }
            break;
    }
}
}
