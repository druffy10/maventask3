package ru.netology.maventask.services;

public class StatsService {
    public int getTotalSales(int[] sales){
        int total = 0;
        for (int monthSale : sales) {
            total = total + monthSale;
        }
        return total;
    }
    public double getAverageSales(int[] sales){
        double average = (double) getTotalSales(sales) / sales.length;
        return average;
    }
    public int getSalesMaxMonth(int[] sales){
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }
    public int getSalesMinMonth(int[] sales){
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
    public int getMonthsBelowAverageSales(int[] sales){
        int average = getTotalSales(sales) / sales.length;
        int count = 0;
        for (int monthSale : sales) {
            if (monthSale < average) {
                count++;
            }
        }
        return count;
    }
    public int getMonthsAboveAverageSales(int[] sales){
        int average = getTotalSales(sales) / sales.length;
        int count = 0;
        for (int monthSale : sales) {
            if (monthSale > average) {
                count++;
            }
        }
        return count;
    }

}
