package com.brideglabz;

/**
 * Purpose - To simulate a Gab Invoice Generator
 * @author - Sakshi Shetty
 * @version - 8.0
 * @since - 2021-09-25
 */
public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KM = 10;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FAIR = 5.0;

    public double calculateFair(double distance, int time) {
        double totalFair = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
        if(totalFair<MINIMUM_FAIR)
            return MINIMUM_FAIR;
        return totalFair;
    }
}
