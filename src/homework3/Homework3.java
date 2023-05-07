package homework3;

import java.util.Arrays;
import java.util.Random;

public class Homework3 {

    public void forPrintFrom1to99() {
        System.out.print("Odd numbers from 1 to 99 is ");
        for (int i = 1; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void calculateTheFactorialN(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("The factorial " + n + " is equal to " + result);
    }

    public void whileTask(int n) {
        int i = 1;
        System.out.print("Odd numbers from 1 to 99 is ");
        while (i <= 99) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();

        int result = 1;
        i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println("The factorial " + n + " is equal to " + result);
    }

    public void doWhileTask(int n) {
        int i = 1;
        System.out.print("Odd numbers from 1 to 99 is ");
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 99);
        System.out.println();

        int result = 1;
        i = 1;
        do {
            result *= i;
            i++;
        } while (i <= n);
        System.out.println("The factorial " + n + " is equal to " + result);
    }

    public void raisingNumberToPower(int x, int n) {
        double result = Math.pow(x, n);
        int resultInt = (int) result;
        System.out.println(x + " ^ " + n + " is equal to " + resultInt);
    }

    public void theFirstTenNumbersOfTheSequence(int n) {
        System.out.print("The first 10 numbers of the sequence are: ");
        int counter = 1;
        for (int i = 0; counter <= n; i -= 5) {
            counter++;
            System.out.print(i + " ");
        }
        System.out.println();
    }
//        може таk треба але в коді в горі ми можемо змінити 10 на любе число
//        якщо нам завтра треба буде 15.
//        public void theFirstTenNumbersOfTheSequence() {
//            System.out.print("The first 10 numbers of the sequence are: ");
//            int number = 0;
//            for (int i = 0; i < 10; i++) {
//                System.out.print(number + " ");
//                number -= 5;}

    public void multiplicationTableByX(int num) {
        System.out.println("Table of multiplication by x : ");
        for (int x = 0; x <= 10; x++) {
            double result = num * x;
            int resultInt = (int) result;
            System.out.print(x + " * " + num + " = " + resultInt + "; ");
        }
        System.out.println();
    }

    public void arrayOfTheFirstTenOddNumbers() {
        int[] numbers = new int[10];
        int count = 0;
        int currentNumber = 1;

        while (count < 10) {
            numbers[count] = currentNumber;
            currentNumber += 2;
            count++;
        }
        System.out.print("An array of the first 10 odd numbers: ");
        for (int number : numbers) {
            System.out.print(number);
            if (number != numbers[numbers.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void TheSmallestArrayElement(int N) {
        int[] array = new int[N];

        Random random = new Random();

        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(900) + 33;
        }
        System.out.print("The length of the array: " + N + " contains a value is: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Min value: " + minValue);
    }

    public void TheLargestArrayElement(int N) {
        int[] array = new int[N];

        Random random = new Random();

        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(900) + 33;
        }
        System.out.print("The length of the array: " + N + " contains a value is: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Max value: " + maxValue);
    }

    public void swapTheMaximumAndMinimumElements() {
        int[] array = {4, -5, 0, 6, 8};
        System.out.println("Array: " + Arrays.toString(array));

        int maxValue = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

        System.out.println("Updated array: " + Arrays.toString(array));
    }
}