package by.epam.lesson2.utils;

import java.util.Scanner;

public class Utils {

   public static double scannerDouble() {
        Scanner scanner = new Scanner(System.in);
        double number;
        System.out.print("Введите число: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Некорректный ввод! Повторите ввод снова");
        }
        number = scanner.nextDouble();
        return number;
    }

    public static int scannerInt() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Введите число: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Некорректный ввод! Повторите ввод снова");
        }
        number = scanner.nextInt();
        return number;
    }

}
