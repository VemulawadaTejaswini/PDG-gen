import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[q];
        for (int i = 0 ; i < q ; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0 ; i < q ; i++) {
            b[a[i] - 1]++;
        }
        for (int i = 0 ; i < n ; i++) {
            System.out.println(k - q + b[i] > 0 ? "Yes" : "No");
        }
    }

}