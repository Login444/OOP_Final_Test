package org.example.module;

public class ComplexNum {
    public Double realNum1;
    private String plus = "+";
    public Double realNum2;
    protected String imaginaryUnit = "i";

    public ComplexNum(Double realNum1, Double realNum2) {
        this.realNum1 = realNum1;
        this.realNum2 = realNum2;
    }

    public ComplexNum() {
    }

    public Double getRealNum1() {
        return realNum1;
    }

    public Double getRealNum2() {
        return realNum2;
    }

    @Override
    public String toString() {
        return  realNum1 + plus + realNum2 + imaginaryUnit;
    }

    public void setRealNum1(Double realNum1) {
        this.realNum1 = realNum1;
    }

    public void setRealNum2(Double realNum2) {
        this.realNum2 = realNum2;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }
}
