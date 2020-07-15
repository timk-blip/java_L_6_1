package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationStatisticsTest {
    public int[] mounths = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public int m_total;

    @Test
    public void averageamount() {
        int average;
        int i;
        for (i = 0; i < 12; i++) {
            m_total += mounths[i];
        }
        average = m_total / 12;
        System.out.println("average " + average);
        assertEquals(15, average);

    }

    @Test
    void total() {
        CalculationStatistics totalTest = new CalculationStatistics();
        int actual = totalTest.total();
        assertEquals(180, actual);
    }

    @Test
    void testAverageamount() {
        CalculationStatistics averageTest = new CalculationStatistics();
        int actual = averageTest.averageamount();
        assertEquals(15, actual);
    }

    @Test
    void maxSumm() {
        CalculationStatistics maxSummTest = new CalculationStatistics();
        int actual = maxSummTest.maxSumm();
        assertEquals(8, actual);
    }

    @Test
    void minSumm() {
        CalculationStatistics minSummTest = new CalculationStatistics();
        int actual = minSummTest.minSumm();
        assertEquals(9, actual);
    }

    @Test
    void minAverageMounths() {
        CalculationStatistics minAverageTest = new CalculationStatistics();
        int actual = minAverageTest.minAverageMounths();
        assertEquals(5, actual);
    }

    @Test
    void maxAverageMounths() {
    CalculationStatistics maxAverageTest = new CalculationStatistics();
    int actual = maxAverageTest.maxAverageMounths();
    assertEquals(7, actual);
    }
}