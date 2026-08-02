package Day1;
public class floorandCeil {
    public static void findfloorandCeil(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int floor = -1;
        int ceil = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            } else if (arr[mid] < target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }
        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 5;
        findfloorandCeil(arr, target);
    }
}