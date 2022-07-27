package by.epam.lesson2.task6;

import by.epam.lesson2.utils.Utils;

public class Main {
    public static void main (String args[]) {
        System.out.println("Для решения задачи Вам потребуется ввести количество маленьких бидонов");
        int numberOfSmallTin = Utils.scannerInt();
        System.out.println("Для решения задачи Вам потребуется ввести количество больших бидонов");
        int numberOfHugeTin = Utils.scannerInt();
        Task6.findAmountOfMilkInHugeTin(numberOfHugeTin, numberOfSmallTin);
    }
}
