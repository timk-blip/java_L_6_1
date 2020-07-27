package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationStatisticsTest {


    @Test
    public void averageamount() {
        CalculationStatistics calculation = new CalculationStatistics();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        calculation.averageamount(month);
        int expected = 15;
        int actual = calculation.averageamount(month);
        assertEquals(expected, actual);

    }

    @Test
    void total() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CalculationStatistics totalTest = new CalculationStatistics();
        int actual = totalTest.total(month);
        assertEquals(180, actual);
    }

    @Test
    void testAverageamount() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CalculationStatistics averageTest = new CalculationStatistics();
        assertEquals(15, averageTest.averageamount(months));
    }

    @Test
    void maxSumm() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CalculationStatistics maxSummTest = new CalculationStatistics();
        int actual = maxSummTest.maxSumm(month);
        assertEquals(8, actual);
    }

    @Test
    void minSumm() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CalculationStatistics minSummTest = new CalculationStatistics();
        int actual = minSummTest.minSumm(month);
        assertEquals(9, actual);
    }

    @Test
    void minAverageMounths() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        CalculationStatistics minAverageTest = new CalculationStatistics();
        int actual = minAverageTest.minAverageMounths(month);
        assertEquals(5, actual);
    }

    @Test
    void maxAverageMounths() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    CalculationStatistics maxAverageTest = new CalculationStatistics();
    int actual = maxAverageTest.maxAverageMounths(month);
    assertEquals(7, actual);
    }
}