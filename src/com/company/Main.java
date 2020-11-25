package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        int principal = (int) console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) console.readNumber("Period(year): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new Report(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
}