import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int avg = (int) Math.round(total / n);
        int totalStamina = 0;
        for (int i = 0; i < n; i++) {
            totalStamina += Math.pow(Math.abs(avg - arr[i]), 2);
        }
        System.out.println(totalStamina);
    }
}