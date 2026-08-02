package Day1;
public class Leetcode1295 {
     public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = countDigits(num);

            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        int digits = 0;

        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] nums = {12, 345, 20, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}