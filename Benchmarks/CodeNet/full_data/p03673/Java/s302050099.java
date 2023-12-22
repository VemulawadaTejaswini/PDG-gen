import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        ArrayList<Long> aa = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            aa.add(a[i]);
            Collections.reverse(aa);
        }
        for (Long long1 : aa) {
            System.out.print(long1 + " ");
        }
    }
}