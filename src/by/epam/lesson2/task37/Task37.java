package by.epam.lesson2.task37;
// Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
//false — в противном случае:
// • Целое число N является четным двузначным числом.
//• Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
//• Сумма цифр данного трехзначного числа N является четным числом.
//• Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
//• Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
//• Треугольник со сторонами а,b,с является равнобедренным.
//• Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
//• Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
//• График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).

import by.epam.lesson2.utils.Utils;

public class Task37 {

    public static void main (String args[]) {
        Task37.defineTrueOrFalse();

    }

    public static void defineTrueOrFalse() {
        int num = Utils.scannerInt();
        int sum;
        if (num > 99 && num <= 999) {
            String str = Integer.toString(num);
            char[] chars = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                chars[i] = str.charAt(i);
            }
            int[] array = new int[chars.length];
            for (int i = 0;  i < chars.length; i++) {
                array[i] = Integer.parseInt(chars[i] + "");
            }
            sum = array[0] + array[1] + array[2];
            if (sum%2 == 0) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }

        } else {
            System.out.println("Увы, введено не трехзначное число! попробуйте ввести число снова");
            num = Utils.scannerInt();
            Task37.defineTrueOrFalse();
        }
    }
}
