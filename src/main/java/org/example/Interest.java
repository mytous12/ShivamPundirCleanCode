package org.example;

public class Interest {
    private double principal;
    private double rate;
    private double years;

    double getSimpleInterest() {
        return principal * rate * years / 100;
    }

    double getCompoundInterest() {
        return principal * Math.pow((1 + rate / 100), years) - principal;
    }
}
