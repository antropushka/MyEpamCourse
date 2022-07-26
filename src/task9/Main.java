package task9;
 // Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.


public class Main {
    public static void main (String args[]) {

        int[] firstArray = {2,4,6,8,9,76,5,3};
        int[] secondArray = {7,9,1,2,3,44,47,87,12};
        int k = 4;

        int[] finalArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, finalArray, 0, k+1);
        System.arraycopy(secondArray, 0, finalArray, k+1, secondArray.length);
        System.arraycopy(firstArray, k+1, finalArray, secondArray.length+k+1, firstArray.length-(k+1));


        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }
    }
}
