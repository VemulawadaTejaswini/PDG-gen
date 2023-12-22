import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int count = 0;

        while (left < arr.length) {
            if (arr[left] == 0) left++;
            else {
                int right = left;

                while (right < arr.length && arr[right] != 0) {
                    arr[right++]--;
                }
                count++;
            }
        }
        System.out.println(count);
    }
}