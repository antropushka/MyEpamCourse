package by.epam.lesson1.task2;

import java.util.Scanner;

public class Main {

    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Введите значение a");
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println("введены не корректные данные, повторите ввод снова");
        }
        a = scanner.nextDouble();
        System.out.println("Значение a = " + a);
        System.out.println("Введите значение b");
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println("введены не корректные данные, повторите ввод снова");
        }
        b = scanner.nextDouble();
        System.out.println("Значение b = " + b);
        System.out.println("Введите значение c");
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println("введены не корректные данные, повторите ввод снова");
        }
        c = scanner.nextDouble();
        System.out.println("Значение c = " + c);
        double ammont = ((b + Math.sqrt(b*b + 4*a*c)) / 2*a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(ammont);



//        System.out.println("Введите целое число.");
//        System.out.print("> ");
//        while(!sc.hasNextInt()){
//            sc.nextLine();//извлекли ошибочный ввод пользователя
//            System.out.println("Вы ввели не целое число.");
//            System.out.print("> ");
//        }
//        x = sc.nextInt();
//        System.out.println("Вы ввели " + x);
//        a = 3.6;
//        b = 8.0;
//        c = 9.0;
//
//        double ammont = ((b + Math.sqrt(b*b + 4*a*c)) / 2*a) - Math.pow(a, 3) * c + Math.pow(b, -2);
//        System.out.println(ammont);
    }
}
