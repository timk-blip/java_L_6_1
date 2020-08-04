package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationStatisticsTest {
    CalculationStatistics calculation = new CalculationStatistics();

    @Test
    void total() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CalculationStatistics calculation = new CalculationStatistics();
        int actual = calculation.total(month);
        assertEquals(180, actual);
    }

    @Test
    void testAverageamount() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CalculationStatistics calculation = new CalculationStatistics();
        assertEquals(15, calculation.averageamount(months));
    }

    @Test
    void maxSumm() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CalculationStatistics calculation = new CalculationStatistics();
        int actual = calculation.maxSumm(month);
        assertEquals(8, actual);
    }

    @Test
    void minSumm() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CalculationStatistics calculation = new CalculationStatistics();
        int actual = calculation.minSumm(month);
        assertEquals(9, actual);
    }

    @Test
    void minAverageMounths() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CalculationStatistics calculation = new CalculationStatistics();
        int actual = calculation.minAverageMounths(month);
        assertEquals(5, actual);
    }

    @Test
    void maxAverageMounths() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    CalculationStatistics calculation = new CalculationStatistics();
    int actual = calculation.maxAverageMounths(month);
    assertEquals(7, actual);
    }
}