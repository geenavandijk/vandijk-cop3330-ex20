/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxCalculator {

    static public void main (String[] args){
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        float amount;
        float tax = 0.0F;
        String state, county;

        System.out.println("What is the order amount? ");
        amount = input.nextFloat();

        System.out.println("What state do you live in? ");
        state = input.next();

        if (state.equals("Wisconsin")){
            System.out.println("What county do you live in? ");
            county = input.next();

            if (county.equals("Eau Claire"))
                tax = (float) 0.05;
            if (county.equals("Dunn"))
                tax = (float) 0.04;
        }
        if (state.equals("Illinois"))
            tax = (float) 0.08;

        df.setRoundingMode(RoundingMode.UP);

        System.out.printf ("The tax is $"+df.format(tax*amount)+".\nThe total amount is $"+ df.format ((tax*amount)+amount)+".");






    }
}
