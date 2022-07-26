package task1;
//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
// и false — в противном случае:
//        Сумма двух первых цифр заданного четырехзначного числа
//        равна сумме двух его последних цифр.


import java.util.Scanner;

public class Main {

    public static void main (String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четырехзначное число");
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num >= 1000 && num <= 9999) {
                String string = Integer.toString(num);
                char[] chars = new char[string.length()];
                for (int i = 0; i < string.length(); i++) {
                    chars[i] = string.charAt(i);
                }
                int[] array = new int[chars.length];
                for (int i = 0;  i < chars.length; i++) {
                    array[i] = Integer.parseInt(chars[i] + "");
                }
                if (array[0] + array[1] == array[2] + array[3]) {
                    System.out.println("TRUE");
                } else {
                    System.out.println("FALSE");
                }
            } else {
                System.out.println( "указанное число не входит в заданный диапазон");
            }
        } else {
            System.out.println("Введенное значение не корректно");
        }

    }
}

