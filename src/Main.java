public class Main {
    public static void main(String[] args) {
        double[] numbers = {8, 2, -4, 2, 3, 6, -7, 1.5, -0.5, 4.2, -3.8, 2.7, -1.3, 5.8, -6.1};
        double sumPositive = 0;
        int countPositive = 0;
        boolean negativeEncountered = false;
        boolean positiveAfterNegative = false;

        for (double num : numbers) {
            if (negativeEncountered && num > 0) {
                sumPositive += num;
                countPositive++;
                positiveAfterNegative = true;
            }
            if (!negativeEncountered && num < 0) {
                negativeEncountered = true;
            }
        }

        if (positiveAfterNegative) {
            double averagePositive = sumPositive / countPositive;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + averagePositive);
        } else {
            System.out.println("После первого отрицательного числа не было положительных чисел.");
        }
    }
}