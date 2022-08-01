package by.epam.lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cycles {
    /**
     * Выполнены следующие задачи: task5 oddNumbersSum(); task25 findFactorial(); task31 guessNumber();
     * task35 findFourDigitNum(); task39 findNeededNum();
     * @author Tatsiana Tkachova
     */
    public static void main(String[] args) {

        oddNumbersSum();
        findFactorial();
        guessNumber();
        findFourDigitNum();
        findNeededNum();
    }

    public static int oddNumbersSum() {
        int sum = 0;
        int i = 1;
        while (i <= 99) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
        return sum;
    }

    public static int findFactorial() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int numberFactorial = 1;
        System.out.println("Введите целое число.");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Вы ввели не целое число.");
        }
        number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            numberFactorial = numberFactorial * i;
        }
        System.out.println("Факториал числа " + number + " равен " + numberFactorial);
        return numberFactorial;
    }

    public static void guessNumber() {
        int[] arrayOfComputersNum = new int[5];
        int[] arrayOfUsersNum = new int[5];
        ArrayList<Integer> numAreGuessed = new ArrayList<Integer>();
        ArrayList<Integer> numAreNotGuessed = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 целых чисел в диапозоне от 1 до 15 через (через ENTER).");

        for (int i = 0; i < 5; i++) {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.printf("Вы ввели не целое число.");
            }
            int usersNum = scanner.nextInt();
            arrayOfUsersNum[i] = usersNum;
        }
        for (int i = 0; i < 5; i++) {
            int computersNum = (int) (Math.random() * 15) + 1;
            arrayOfComputersNum[i] = computersNum;
        }
        for (int j = 0; j < 5; j++) {
            if (arrayOfComputersNum[j] == arrayOfUsersNum[j]) {
                numAreGuessed.add(arrayOfUsersNum[j]);
            } else if (arrayOfComputersNum[j] != arrayOfUsersNum[j]) {
                numAreNotGuessed.add(arrayOfUsersNum[j]);
            }
        }
        if (numAreGuessed.isEmpty()) {
            System.out.println("Упс, вы не угадали ни одного числа! Числа, уоторые вы не угадали: " + numAreNotGuessed);
        } else if (numAreNotGuessed.size() == 5) {
            System.out.println("Ура, Вы угадали все числа!" + numAreNotGuessed);
        } else {
            System.out.println("Числа, которые вы угадали: " + numAreGuessed);
            System.out.println("Числа, которые вы НЕ  угадали: " + numAreNotGuessed);
        }
    }

    public static int findFourDigitNum() {
        int result1 = 0;
        int result2 = 0;
        for (int i = 10; i <= 99; i++) {
            for (int j = 10; j <= 99; j++) {
                if (((i * 100) + j) % 99 == 00 && ((j * 100) + i) % 49 == 00) {
                    result1 = (i * 100) + j;
                    result2 = (j * 100) + i;
                }
            }
        }
        System.out.println("Числа, удовлетворяющие условию, указанному в задаче № 35: " + result1 + "," + result2);
        return result1;
    }

    public static void findNeededNum() {
        for (int i = 100; i <= 999; i++) {
            if((i % 100) * 7 == i) {
                System.out.println("Число, удовлетворяющее условиям, указанным в задаче № 39: " + i + " .");
            }
        }
    }

}




