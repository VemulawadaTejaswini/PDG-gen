import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static int m;


    public static void main(String[] args) {
        read();
        solve();
    }

    public static void read() {
        n = sc.nextInt();
        m = sc.nextInt();
    }

    public static void solve() {
        long ms = 0;
        int count = 1;
        //全部正解する確率
        double expect = Math.pow(2, m);
        while (count < 1000000) {
            ms += (count * (m * 1900 + (n - m) * 100)) / expect;
            expect *= Math.pow(2, m);
            count++;
        }
        double msd= ms*0.01;

        System.out.println(Math.round(Math.ceil(msd)*100));
    }
}
