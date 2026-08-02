package Day1;

public class CountZeroes {

    public static int countZeroes(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int count = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 0) {
                count = arr.length - mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0};
        System.out.println(countZeroes(arr));
    }
}