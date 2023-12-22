//https://atcoder.jp/contests/abc161/tasks/abc161_c
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long n = in.nextLong(), k = in.nextLong();

        long remainder = n % k;
        out.println(Math.min(remainder,k - remainder));
        out.close();

    }
}
