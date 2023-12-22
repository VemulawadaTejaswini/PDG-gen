import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = n - 1; i >= 0; i -= 2) {
            sumA += a[i];
        }
        for (int i = n - 2; i >= 0; i -= 2) {
            sumB += a[i];
        }
        System.out.println(sumA - sumB);
    }
}