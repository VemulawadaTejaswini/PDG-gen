import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0 ; i < n ; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            q[i] = sc.nextInt();
        }
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = i + 1;
        }
        int count = 0;
        while (!isSameArray(a, p)) {
            nextPermutation(a);
            count++;
        }
        for (int i = 0 ; i < n ; i++) {
            a[i] = i + 1;
        }
        int count2 = 0;
        while (!isSameArray(a, q)) {
            nextPermutation(a);
            count2++;
        }

        System.out.println(Math.abs(count2 - count));

    }

    private static void nextPermutation(int[] nums) {
        int mark = -1;
        for (int i = nums.length - 1 ; i > 0 ; i--) {
            if (nums[i] > nums[i - 1]) {
                mark = i - 1;
                break;
            }
        }
        if (mark == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int idx = nums.length - 1;
        for (int i = nums.length - 1 ; i >= mark + 1 ; i-- ) {
            if (nums[i] > nums[mark]) {
                idx = i;
                break;
            }
        }
        swap(nums, mark, idx);
        reverse(nums, mark + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static boolean isSameArray(int[] a, int[] b) {
        for (int i = 0 ; i < a.length ; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

}