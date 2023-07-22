package org.example.controller;

import org.example.module.ComplexNum;

public class ComplexCalculator implements ComplexOperations{
    public ComplexNum a;
    public ComplexNum b;

    public ComplexCalculator(ComplexNum a, ComplexNum b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public ComplexNum sum() {
        ComplexNum result = new ComplexNum();
        result.setRealNum1(a.getRealNum1()+b.getRealNum1());
        result.setRealNum2(a.getRealNum2()+b.getRealNum2());
        return result;
    }

    @Override
    public ComplexNum subtraction() {
        ComplexNum result = new ComplexNum();
        result.setRealNum1(a.getRealNum1()-b.getRealNum1());
        result.setRealNum2(a.getRealNum2()-b.getRealNum2());
        if (result.getRealNum2()<0) {
            result.setPlus("");
        }
        return result;
    }

    @Override
    public ComplexNum multiple() {
        ComplexNum result = new ComplexNum();
        result.setRealNum1((a.getRealNum1()*b.getRealNum1())-(a.getRealNum2()*b.getRealNum2()));
        result.setRealNum2((a.getRealNum2()*b.getRealNum1())-(a.getRealNum1()*b.getRealNum2()));
        if (result.getRealNum2()<0) {
            result.setPlus("");
        }
        return result;
    }

    @Override
    public ComplexNum division() {
        ComplexNum result = new ComplexNum();
        Double numer1 = (double) a.getRealNum1()*b.getRealNum1()+a.getRealNum2()*b.getRealNum2();
        Double numer2 = (double) a.getRealNum2()*b.getRealNum1()-a.getRealNum1()*b.getRealNum2();
        Double denomer1 = (double) b.getRealNum1()*b.getRealNum1()+b.getRealNum2()*b.getRealNum2();
        Double denomer2 = (double) b.getRealNum1()*b.getRealNum1()+b.getRealNum2()*b.getRealNum2();
        Double resForNum1 = (numer1/denomer1);
        Double resForNum2 = (numer2/denomer2);
        result.setRealNum1(resForNum1);
        result.setRealNum2(resForNum2);
        if (result.getRealNum2()<0) {
            result.setPlus("");
        }
        return result;
    }
}
