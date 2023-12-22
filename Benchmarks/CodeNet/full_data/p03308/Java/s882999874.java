import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                ans = Math.max(ans, Math.abs(a[i] - a[j]));
            }

        }
        System.out.println(ans);
    }

}
