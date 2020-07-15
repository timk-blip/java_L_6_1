package ru.netology.stats;

public class CalculationStatistics {
    public int[] month = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    // public int m_total = 0;

    public static void main() {

    }

    public int total() {
        int result = 0;
        for (int months : month) {
            result += months;
        }
        return result;
    }

    public int averageamount() {
        int average = total() / 12;
        return average;
    }

    public int maxSumm() {
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

    public int minSumm() {
        int index = 0;
        int value = 100;
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

    public int minAverageMounths() {
        int index = 0;
        for (int months : month)
            if (months < averageamount()) {
                index += 1;
            }
        return index;
    }

    public int maxAverageMounths() {
        int index = 0;
        for (int months : month)
            if (months >= averageamount()) {
                index += 1;
            }
        return index;
    }
}
