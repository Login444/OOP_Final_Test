package org.example.controller;

import org.example.module.ComplexNum;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Logger {
    ArrayList<String> logs = new ArrayList<>();

    public Logger(ArrayList<String> logs) {
        this.logs = logs;
    }

    public Logger() {
    }

    public ArrayList<String> getLogs() {
        return logs;
    }

    @Override
    public String toString() {
        return "Logger{" +
                "logs=" + logs +
                '}';
    }

    public ArrayList<String> startProg(){
        String msg = "Запуск программы.";
        logs.add(msg);
        return logs;
    }
    public ArrayList<String> operation(String operation){
        String msg = "Выполнение операции " + operation;
        logs.add(msg);
        return logs;
    }

    public ArrayList<String> enterFirstArg(ComplexNum num){
        String msg = "Капибара - " + num;
        logs.add(msg);
        return logs;
    }

    public ArrayList<String> enterSecondArg(ComplexNum num){
        String msg = "Ввод второго аргумента - " + num;
        logs.add(msg);
        return logs;
    }

    public ArrayList<String> operationResult(ComplexNum num){
        String msg = "Рузультат операции: " + num;
        logs.add(msg);
        return logs;
    }

    public ArrayList<String> finishProg() {
        String msg = "Завершение программы.";
        logs.add(msg);
        return logs;
    }

    public void exportLog(){
        File newFile = new File("log_info.txt");
        try (FileWriter writer = new FileWriter(newFile, true)){
            for (String log : logs) {
                String log_text = log;
                writer.write(log_text + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
