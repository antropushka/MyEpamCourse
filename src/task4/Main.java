package task4;
// Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:

public class Main {
    public static void main (String args[]) {
        int x;
        int y;
        x = 2;
        y = 12;
        if ((x <= 4 && x >= 0 && y <= 2 && y >= -2) || (x <=0 && x >= -3 && y >= -4 && y <=4)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
