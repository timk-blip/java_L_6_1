package ru.netology.stats;

public class CalculationStatistics {
    void calculationStatistics() {
        int[] mounths = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int i;
        int total = 0;
        for (i = 1; i <= 12; i++) {
            total += mounths[i];
        }
        System.out.println(total);

    }

}
