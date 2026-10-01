package Week3Practice;

public class InClassPractice {


    public static void recursiveBinarySearch(int[] arr, int target, int low, int high, int comp) {
        int right = high;
        int left = low;
        comp++;
        int mid = left + (right - left) / 2;
        String format = " left - %s \n right - %s \n index - %s \n comp - %s \n";
        System.out.printf(format, left, right, arr[mid], comp);

        if (arr[mid] == target) {
            System.out.printf(format, left, right, arr[mid], comp);
         }
        if (arr[mid] > target) {
            recursiveBinarySearch(arr, target, left, mid - 1, comp);
        }
        if (arr[mid] < target) {
            recursiveBinarySearch(arr, target, mid + 1, high, comp);
        }
    }

    public static void main(String[] args) {
         int target = 35;
        int[] arr = {3, 7, 12, 18, 23, 27, 31, 35, 39};
        recursiveBinarySearch(arr, target, 0, arr.length - 1, 0);
    }

}
