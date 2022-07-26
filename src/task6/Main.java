package task6;

import java.util.Arrays;

public class Main {
    public static void main (String args[]) {

        int[] nums = {8, 3, 10};
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        System.out.println(min + max);

    }
}
