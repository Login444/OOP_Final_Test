package org.example;

public class ComplexCalculator implements ComplexOperations{

    @Override
    public ComplexNum sum(ComplexNum a, ComplexNum b) {
        ComplexNum result = new ComplexNum();
        result.setRealNum1(a.getRealNum1()+b.getRealNum1());
        result.setRealNum2(a.getRealNum2()+b.getRealNum2());
        return result;
    }

    @Override
    public ComplexNum subtraction(ComplexNum a, ComplexNum b) {
        ComplexNum result = new ComplexNum();
        result.setRealNum1(a.getRealNum1()-b.getRealNum1());
        result.setRealNum2(a.getRealNum2()-b.getRealNum2());
        if (result.getRealNum2()<0) {
            result.setPlus("");
        }
        return result;
    }

    @Override
    public ComplexNum multiple(ComplexNum a, ComplexNum b) {
        ComplexNum result = new ComplexNum();
        result.setRealNum1((a.getRealNum1()*b.getRealNum1())-(a.getRealNum2()*b.getRealNum2()));
        result.setRealNum2((a.getRealNum2()*b.getRealNum1())-(a.getRealNum1()*b.getRealNum2()));
        return result;
    }

    @Override
    public ComplexNum division(ComplexNum a, ComplexNum b) {
        ComplexNum result = new ComplexNum();
        Double numer1 = (double) a.getRealNum1()*b.getRealNum1()+a.getRealNum2()*b.getRealNum2();
        Double numer2 = (double) a.getRealNum2()*b.getRealNum1()-a.getRealNum1()*b.getRealNum2();
        Double denomer1 = (double) b.getRealNum1()*b.getRealNum1()+b.getRealNum2()*b.getRealNum2();
        Double denomer2 = (double) b.getRealNum1()*b.getRealNum1()+b.getRealNum2()*b.getRealNum2();
        Double resForNum1 = (double) (numer1/denomer1);
        Double resForNum2 = (double) (numer2/denomer2);
        result.setRealNum1(resForNum1);
        result.setRealNum2(resForNum2);
        return result;
    }
}
