import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[m];
        int b[] = new int[m];

        ArrayList<Integer> alist = new ArrayList<Integer>();
        ArrayList<Integer> blist = new ArrayList<Integer>();

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if (a[i] == 1) {
                alist.add(b[i]);
            }

            if (b[i] == n) {
                blist.add(a[i]);
            }
        }

        for (int i = 2; i <= n; i++) {
            if (alist.contains(i) && blist.contains(i)) {
                System.out.println("POSSIBLE");
                return;
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}