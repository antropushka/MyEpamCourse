package by.epam.lesson1.task3;
//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катето

public class Main {
    public static void main (String args[]) {

        double a;
        double b;
        double c;
        double triangleSquare;
        double trianglePerimeter;

        a = 4.0;
        b = 4.0;

        c = Math.sqrt(a * a + b * b);
        System.out.println(c);

        triangleSquare = (a * b) / 2;
        System.out.println(triangleSquare);

        trianglePerimeter = a + b + c;
        System.out.println(trianglePerimeter);
    }
}
