package task8;

public class Main {
    public static void main (String args[]) {

        int n;
        n = 4;

        int k;
        k = 3;

        int sum;
        sum = 0;

        int[] nums = new int[n];
        nums[0] = - 9;
        nums[1] = 6;
        nums[2] = 12;
        nums[3] = 15;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0 && nums[i] > 0) {
                sum += nums[i];
            }
        }
        System.out.println(sum);










    }
}
