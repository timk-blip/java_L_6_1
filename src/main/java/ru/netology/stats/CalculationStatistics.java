package ru.netology.stats;

public class CalculationStatistics {
    public static void main() {

    }

    public int[] mounths = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int averageamount() {
        int average = 0;
        average = calculationStatistics() / 2;
        System.out.println(average);
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
        int tmp = 0;
        for (int i = 0; i < mounths.length; i++) {
            int max = mounths[i];
            if (mounths[i] > max) {
            max = mounths[i];
            }
        }
        return tmp;
    }
}
