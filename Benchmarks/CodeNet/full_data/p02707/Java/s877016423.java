
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());

        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = Integer.parseInt(scan.next());
            a[i]--;
        }
        scan.close();

        int[] ans = new int[n];
        for (int i = 0; i < n-1; i++) {
            ans[a[i]]++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }

    }

}
