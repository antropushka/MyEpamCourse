package task7;
//Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. Результат представить
       // в виде таблицы, первый столбец которой – значения  аргумента, второй - соответствующие значения функции:

public class Main {
    public static void main (String args[]) {
        double a, b, h, x;
        a = 1.0;
        b = 3.0;
        h = 0.5;
        System.out.println("---------------------------");
        System.out.println("      x      |      Fx     ");
        System.out.println("---------------------------");
        for ( double i = a; i <= b; i+= h) {
            double Fx = Math.sin(i) * Math.sin(i) - Math.cos(2 * i);
            System.out.printf("|%-12f|%-12f|\n", i, Fx);
        }
    }
}
