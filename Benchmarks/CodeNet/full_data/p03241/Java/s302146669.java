import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();

        int res = 1;

        int div = m / n;
        int remain = m - div * (n - 1);

//        System.out.print(div);
//        System.out.print(remain);

        while (2 <= remain) {
            int gcd = gcd(div, remain);
            res = Math.max(res, gcd);
            div++;
            remain -= (n-1);
        }

        System.out.print(res);


    }

    int gcd(int s, int t) {
        if (s < t) return gcd(t, s);
        if (t == 0) return s;
        return gcd(t, s % t);
    }




}

