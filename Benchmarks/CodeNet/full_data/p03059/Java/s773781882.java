import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int t = sc.nextInt();
            int res = process(a, b, t);
            System.out.println(res);
        }
        sc.close();
    }

    private static int process(int a, int b, int t) {
        int n = t / a;
        return n * b;
    }
}
