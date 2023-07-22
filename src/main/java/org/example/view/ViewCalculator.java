package org.example.view;

import org.example.controller.Logger;
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
            Logger log = new Logger();
            log.startProg();
            System.out.println("Вводим 1-е комплексное число: ");
            ComplexNum num1 = new ComplexNum(setNums1(), setNums2());
            log.enterFirstArg(num1);
            System.out.println("Вводим 2-е комплексное число: ");
            ComplexNum num2 = new ComplexNum(setNums1(),setNums2());
            log.enterSecondArg(num2);
            ComplexCalculator calculator = new ComplexCalculator(num1,num2);
            while (true){
                String cmd = choice("Введите команду (+, -, *, /)");
                if (cmd.equals("+")){
                    log.operation("+");
                    ComplexNum result = calculator.sum();
                    System.out.println(result);
                    log.operationResult(result);
                    break;
                }
                if (cmd.equals("-")){
                    log.operation("-");
                    ComplexNum result = calculator.subtraction();
                    System.out.println(result);
                    log.operationResult(result);
                    break;
                }
                if (cmd.equals("*")){
                    log.operation("*");
                    ComplexNum result = calculator.multiple();
                    System.out.println(result);
                    log.operationResult(result);
                    break;
                }
                if (cmd.equals("/")){
                    log.operation("/");
                    ComplexNum result = calculator.division();
                    System.out.println(result);
                    log.operationResult(result);
                    break;
                }

            }
            String cmd = choice("Еще считаем (Y/N)?");
            if (cmd.equals("Y")){
                continue;
            }
            log.finishProg();
            log.exportLog();
            break;
    }
}
}
