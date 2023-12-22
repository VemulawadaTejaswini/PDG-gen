

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(), k =in.nextInt();

        int remainder = n % k;
        out.println(Math.min(remainder,k - remainder));
        out.close();

    }
}
