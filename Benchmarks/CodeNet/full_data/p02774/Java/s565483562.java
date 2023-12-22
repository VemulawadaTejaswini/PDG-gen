import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC155D - Pairs

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];

        ArrayList<Long> lst = new ArrayList();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                lst.add((long)a[i] * (long)a[j]);
            }
        }

        Collections.sort(lst);

        System.out.println(lst.get(k - 1));
    }
}