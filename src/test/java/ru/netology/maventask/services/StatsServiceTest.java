package ru.netology.maventask.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    @Test
    public void testGetTotalSales() {
        StatsService statsService = new StatsService();
        int expectedTotal = 180;
        int actualTotal = statsService.getTotalSales(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void testGetAverageSales() {
        StatsService statsService = new StatsService();
        double expectedAverage = 15.0;
        double actualAverage = statsService.getAverageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void testGetSalesMaxMonth() {
        StatsService statsService = new StatsService();
        int expectedSalesMaxMonth = 8;
        int actualAverage = statsService.getSalesMaxMonth(sales);

        Assertions.assertEquals(expectedSalesMaxMonth, actualAverage);
    }

    @Test
    public void testGetSalesMinMonth() {
        StatsService statsService = new StatsService();
        int expectedSalesMinMonth = 9;
        int actualAverage = statsService.getSalesMinMonth(sales);

        Assertions.assertEquals(expectedSalesMinMonth, actualAverage);
    }

    @Test
    public void testGetMonthsBelowAverageSales() {
        StatsService statsService = new StatsService();
        int expectedMonthsBelowAverageSales = 5;
        int actualAverage = statsService.getMonthsBelowAverageSales(sales);

        Assertions.assertEquals(expectedMonthsBelowAverageSales, actualAverage);
    }

    @Test
    public void testGetMonthsAboveAverageSales() {
        StatsService statsService = new StatsService();
        int expectedMonthsAboveAverageSales = 5;
        int actualAverage = statsService.getMonthsAboveAverageSales(sales);

        Assertions.assertEquals(expectedMonthsAboveAverageSales, actualAverage);
    }
}