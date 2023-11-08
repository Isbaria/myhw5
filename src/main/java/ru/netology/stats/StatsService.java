package ru.netology.stats;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StatsService {

    public int salesAmount(long[] sales) {
        int sumSales = (int) Arrays.stream(sales).sum();

        return sumSales;
    }

    public int averageAmountOfSalesPerMonth(long[] sales) {
        double average = 0;
        if (sales.length > 0) {
            double sumSales = 0;
            for (int i = 0; i < sales.length; i++) {
                sumSales += sales[i];
            }
            average = sumSales / sales.length;
        }
        return (int) average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberMonthSalesBelowAverage(long[] sales) {
        int average = (int) averageAmountOfSalesPerMonth(sales);
        int numberBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                numberBelowAverage = numberBelowAverage + 1;
            }
        }
        return numberBelowAverage;
    }

    public int numberMonthSalesAboveAverage(long[] sales) {
        int average = (int) averageAmountOfSalesPerMonth(sales);
        int numberAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                numberAboveAverage = numberAboveAverage + 1;
            }
        }
        return numberAboveAverage;
    }
}
