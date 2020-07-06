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

        int index = 0;
        int value = 0;

        for (var i = 0; i < 12; i++) {
            if (value <= mounths[i]) {
                value = mounths[i];
                index = i;
            }
        }
        System.out.println("index " + index);
        assertEquals(7, index);
    }

    @Test
    void testMinSumm() {
        int index = 0;
        int value = 110;

        for (var i = 0; i < 12; i++) {
            if (value >= mounths[i]) {
                value = mounths[i];
                index = i;
            }

        }
        System.out.println("index " + index);
        assertEquals(8, index);
    }

    @Test
    void minAverageMounths() {
        int average;
        int quantityMounths = 0;
        int i;
        for (i = 0; i < 12; i++) {
            m_total += mounths[i];
        }
        average = m_total / 12;
        int minAverage = 0;
        int indexMounth = 0;
        for (i = 0; i < 12; i++) {
            if (mounths[i] < average) {
                minAverage = mounths[i];
                indexMounth ++;
            }

        }

        System.out.println("indexMounth " + indexMounth);
        assertEquals(5, indexMounth);
    }

    @Test
    void maxAverageMounths() {
        int average;
        int quantityMounths = 0;
        int i;
        for (i = 0; i < 12; i++) {
            m_total += mounths[i];
        }
        average = m_total / 12;
        int maxAverage = 0;
        int indexMounth = 0;
        for (i = 0; i < 12; i++) {
            if (mounths[i] >= average) {
                maxAverage = mounths[i];
                indexMounth ++;
            }

        }

        System.out.println("indexMounth " + indexMounth);
        assertEquals(7, indexMounth);
    }
}