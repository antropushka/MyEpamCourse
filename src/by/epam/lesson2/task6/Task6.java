package by.epam.lesson2.task6;

//6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,
// если в каждом большом бидоне на 12 л. больше, чем в малом?

import java.util.Scanner;

public class Task6 {

    private static int AmountOfMilkInSmallTin = 80;

    public static void findAmountOfMilkInHugeTin (int numberOfHugeTin, int numberOfSmallTin) {
        System.out.println("В " + numberOfHugeTin + " больших бидонах количество молока равно  "
                + ((80 / numberOfSmallTin + 12) * numberOfHugeTin) + " литров");
    }
}
