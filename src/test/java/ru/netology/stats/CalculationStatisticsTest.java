package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationStatisticsTest {
    public int[] mounths = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public int m_total;

    @Test
    public void averageamount() {
        int average;

        average = m_total / 12;
        System.out.println("average " + average);
        assertEquals(15, average);

    }

    @Test
    void in_between_test() {
        System.out.println("in between test");
    }


    @Test
    public void calculationStatistics() {
        int i;
        for (i = 0; i < 12; i++) {
            m_total += mounths[i];
        }

        System.out.println("Total " + m_total);
        assertEquals(180, m_total);
    }


    @Test
    void maxSumm() {
        int tmp = 0;
        int i;
        int max = mounths[0];
        for (i = 0; i < 12; i++) {
            if (max < mounths[i])
            {
                max = mounths[i];
                i = mounths[i];
            }
        }
        assertEquals(8, mounths[i] );
    }
}