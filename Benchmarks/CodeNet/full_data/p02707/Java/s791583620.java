import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        // String s = sc.next();
        int[] a = new int[n+1];
        int[] b = new int[n+1];

        for (int i = 2; i <= n; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[a[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(b[i]);
        }
        // System.out.println();
        sc.close();
    }

}