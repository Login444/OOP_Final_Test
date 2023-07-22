package org.example;

public class ComplexNum {
    public Number realNum1;
    private String plus = "+";
    public Number realNum2;
    protected String imaginaryUnit = "i";

    public ComplexNum(Number realNum1, Number realNum2) {
        this.realNum1 = realNum1;
        this.realNum2 = realNum2;
    }

    public ComplexNum() {
    }

    public Integer getRealNum1() {
        return (Integer) realNum1;
    }

    public String getPlus() {
        return plus;
    }

    public Integer getRealNum2() {
        return (Integer) realNum2;
    }

    public String getImaginaryUnit() {
        return imaginaryUnit;
    }

    @Override
    public String toString() {
        return  realNum1 + plus + realNum2 + imaginaryUnit;
    }

    public void setRealNum1(Number realNum1) {
        this.realNum1 = realNum1;
    }

    public void setRealNum2(Number realNum2) {
        this.realNum2 = realNum2;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }
}
