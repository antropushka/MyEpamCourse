package by.epam.lesson3;

public class BranchingStatements {
    /**
     * Выполнены следующие задачи: task8 findSmallerNumSquare(num1, num2); task14 isItTriangle(oneTriangleAngle, twoTriangleAngle);
     * task33 defineAccessLevel(passwordStr); task34 buyBook(booksPrice, buyersMoney); task37  findFunctionValue(x);
     * @author Tatsiana Tkachova
     */
    public static void main(String[] args) {

        double num1 = 12;
        double num2 = 30;
        double oneTriangleAngle = 90;
        double twoTriangleAngle = 45;
        String passwordStr = "8997";
        double booksPrice = 3400.45;
        double buyersMoney = 2300;
        int x = 0;

//        //findSmallerNumSquare(num1, num2);
//        isItTriangle(oneTriangleAngle, twoTriangleAngle);
//        //defineAccessLevel(passwordStr);
//        //buyBook(booksPrice, buyersMoney);
//        //findFunctionValue(x);
    }
    public static void findSmallerNumSquare (double num1, double num2) {
        if (num1 * num1 < num2 * num2) {
            System.out.println(num2 * num2);
        } else if (num2 * num2 < num1 * num1) {
            System.out.println(num1 * num1);
        } else if (num1 * num1 == num2 * num2) {
            System.out.println("квадраты чисел равны");
        }
    }

    public static boolean isItTriangle (double oneTriangleAngle, double twoTriangleAngle) {
        boolean isItTriangle = false;
        if (oneTriangleAngle + twoTriangleAngle < 180 && oneTriangleAngle + twoTriangleAngle != 90) {
            System.out.println(true);
        } else if (oneTriangleAngle + twoTriangleAngle == 90) {
            System.out.println("Прямоугольник с заданными углами является прямоугольным");
        } else {
            System.out.println(false);
        }
        return isItTriangle;
    }

    public static void defineAccessLevel (String passwordStr) {
        int password = Integer.parseInt(passwordStr);
        if (password == 9445 || password == 8997) {
            System.out.println("Вым доступны 3 модуля баз данных: A, B, C.");
        } else if (password == 3331 || password == 7922) {
            System.out.println("Вым доступны 2 модуля баз данных: B, C.");
        } else if (password == 9583 || password == 1747) {
            System.out.println("Вым доступен 1 модуль баз данных: A.");
        } else {
            System.out.println("Введен неверный пароль! Вам отказано в доступе ко всем модулям БД!");
        }
    }

    public static void buyBook (double booksPrice, double buyersMoney) {
        if (buyersMoney > booksPrice) {
            double oddMoney =  buyersMoney -  booksPrice;
            System.out.println("Спасибо за покупку! Возьмите сдачу " + oddMoney + " . Ждем Вас снова!");
        } else if (buyersMoney < booksPrice) {
            double addMoney =  booksPrice - buyersMoney;
            System.out.println("Недостаточно денежных средств. Чтобы продолжить рокупку внесите " + addMoney + " рублей.");
        } else if (buyersMoney == booksPrice) {
            System.out.println("Спасибо за покупку! Ждем Вас снова!");
        }
    }

    public static double findFunctionValue (int x) {
        double Fx = 0;
        if (x >= 3) {
            Fx = -(x * x)+ (3 * x) + 9;
        } else if (x < 3) {
            Fx = 1 / (Math.pow(x, 3) - 6);
        }
        System.out.println("Fx = " + Fx);
        return Fx;
    }

}

