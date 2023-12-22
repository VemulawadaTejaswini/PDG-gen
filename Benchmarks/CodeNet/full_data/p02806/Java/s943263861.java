import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int[]  t = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            t[i] = sc.nextInt();
        }

        String x  = sc.next();

        // logic

        long ct = 0;
        for (int v = n-1; v >= 0; v--) {
            if (x.contains(s[v])) break;
            ct += t[v];
        }

        System.out.println(ct);
    }
}