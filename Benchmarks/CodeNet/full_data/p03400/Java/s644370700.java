import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum += (d + a[i] - 1) / a[i];
        }
        sum += x;
        System.out.println(sum);
    }

}