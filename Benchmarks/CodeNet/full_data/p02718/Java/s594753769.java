import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        Arrays.sort(arr);
        int target = arr[n - m];
        if (target * 4 * m < total) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
