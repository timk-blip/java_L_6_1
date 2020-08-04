package ru.netology.stats;

public class CalculationStatistics {

    public int total(int[] month) {
        int result = 0;
        for (int months : month) {
            result += months;
        }
        return result;
    }

    public int averageamount(int[] month) {
        int average = total(month) / 12;
        return average;
    }

    public int maxSumm(int[] month) {
        int index = 0;
        int value = 0;
        int count = 0;
        for (int months : month) {
            count += 1;
            if (value <= months) {
                value = months;
                index = count;
            }
        }
        return index;
    }

    public int minSumm(int[] month) {
        int index = 0;
        int value = month[0];
        int count = 0;
        for (int months : month) {
            count += 1;
            if (value >= months) {
                value = months;
                index = count;
            }
        }
        return index;
    }

    public int minAverageMounths(int[] month) {
        int index = 0;
        int average = averageamount(month);
        for (int months : month)
            if (months < average) {
                index++;
            }
        return index;
    }

    public int maxAverageMounths(int[] month) {
        int index = 0;
        int average = averageamount(month);
        for (int months : month)
            if (months >= average) {
                index += 1;
            }
        return index;
    }
}
