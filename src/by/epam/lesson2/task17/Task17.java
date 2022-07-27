package by.epam.lesson2.task17;
// Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

import by.epam.lesson2.utils.Utils;


public class Task17 {
    public static void main (String args[]) {
        int num1 = Utils.scannerInt();
        int num2 = Utils.scannerInt();
        Task17.findAverageNumCub(num1, num2);
        Task17.findGeometricMean(num1, num2);
    }

    public static int findNumCube(int someNum) {
        int numCube = someNum*someNum*someNum;
        return numCube;
    }

    public static double findAverageNumCub (int num1, int num2) {
        double averageNumCube = (Task17.findNumCube(num1) + Task17.findNumCube(num2)) / 2;
        System.out.println("Среднее арифметическое кубов чисел " + num1 + " и " + num2 + " = " + averageNumCube);
        return averageNumCube;
    }

    public static double findGeometricMean (int num1, int num2) {
        double geometricMean = Math.sqrt(Math.abs(num1) * Math.abs(num2));
        System.out.println("Среднее асреднее геометрическое модулей чисел " + num1 + " и " + num2
                + " = " + geometricMean);
        return geometricMean;
    }
}
