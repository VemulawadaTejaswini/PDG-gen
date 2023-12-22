
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[q];
        for (int i = 0 ; i < q ; i++) {
            a[i] = sc.nextInt();
        }

        int[] t = new int[n + 1];
        for (int i = 0 ; i < q ; i++) {
            if (a[i] != 1) {
                t[0]++;
                t[a[i] - 1]--;
            }
            if (a[i] != n) {
                t[a[i]]++;
                t[n]--;
            }

        }

        for (int i = 0 ; i < n ; i++) {
            if (0 < i) {
                t[i] += t[i - 1];
            }
        }


        for (int i = 0 ; i < n ; i++) {
            if (t[i] >= k) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }

    }

}