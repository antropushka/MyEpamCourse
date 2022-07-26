package task5;
// Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны,
// и в четвертую степень — отрицательные.


import java.util.ArrayList;

public class Main {
    public static void main (String args[]) {

        ArrayList<Double> firstArray = new ArrayList<Double>();
        ArrayList<Double> arrayAfterChanges = new ArrayList<Double>();
        firstArray.add(5.0);
        firstArray.add(- 4.0);
        firstArray.add(2.0);
        firstArray.add(-3.0);
        for (int i = 0; i < firstArray.size(); i++) {
            if (firstArray.get(i) > 0) {
                arrayAfterChanges.add(firstArray.get(i) * firstArray.get(i));
            } else if ( firstArray.get(i) < 0) {
                arrayAfterChanges.add(Math.pow(firstArray.get(i), 4.0));
            }
        }
        for (int i = 0; i < arrayAfterChanges.size(); i++) {
            System.out.println(arrayAfterChanges.get(i));
        }



    }
}
