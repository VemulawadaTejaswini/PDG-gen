import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //long[] a = new long[n];
        ArrayList<Integer> aa = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            //a[i] = sc.nextLong();
            //aa.add(a[i]);
            aa.add(sc.nextInt());
            Collections.reverse(aa);
        }
        for (int int1 : aa) {
            System.out.print(int1 + " ");
        }
    }
}