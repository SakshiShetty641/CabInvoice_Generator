package com.brideglabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fair = invoiceGenerator.calculateFair(distance, time);
        Assertions.assertEquals(25, fair);
    }

    @Test
    public void givenLessDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 1.0;
        int time = 5;
        double fair = invoiceGenerator.calculateFair(distance, time);
        Assertions.assertEquals(15, fair);
    }

    @Test
    public void givenLessDistanceAndLessTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fair = invoiceGenerator.calculateFair(distance, time);
        Assertions.assertEquals(5, fair);
    }
}