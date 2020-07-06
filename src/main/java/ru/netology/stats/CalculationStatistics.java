package ru.netology.stats;

public class CalculationStatistics {
    public int[] mounths = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public int m_total;

    public static void main() {

    }

    public int averageamount() {
        int average;
        int i;
        for (i = 0; i < 12; i++) {
            m_total += mounths[i];
        }
        average = m_total / 12;
        System.out.println("average " + average);
        return average;
    }

    public int calculationStatistics() {

        int i;
        int total = 0;
        for (i = 1; i <= 12; i++) {
            total += mounths[i];
        }
        System.out.println(total);
        return total;
    }

    public int maxSumm() {
        int index = 0;
        int value = 0;

        for (var i = 0; i < 12; i++) {
            if (value <= mounths[i]) {
                value = mounths[i];
                index = i;
            }
        }
        System.out.println("index " + index);
        return value;
    }

    public int minSumm() {
        int index = 0;
        int value = 110;

        for (var i = 0; i < 12; i++) {
            if (value >= mounths[i]) {
                value = mounths[i];
                index = i;
            }

        }
        System.out.println("index " + index);


        return value;
    }

    public int minAverageMounths() {
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
        return minAverage;
    }

    public int maxAverageMounths() {
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
        return maxAverage;
    }
}
