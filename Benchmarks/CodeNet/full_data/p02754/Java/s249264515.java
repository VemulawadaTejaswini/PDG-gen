import java.util.*;
import java.io.*;
import java.util.function.*;

public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a * b==0) {
            out.println(0);
            out.flush();
            return;
        }
        int x = N / (a+b);
        int r = N % (a+b);
        long res = a * x + Math.min(a, r);




        out.println(res);
        out.flush();
    }

}

