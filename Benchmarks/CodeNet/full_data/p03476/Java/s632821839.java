import java.util.*;
import java.io.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int q=sc.nextInt();
        int[] ln=new int[100001];
        for (int i = 3; i < 100000; i+=2) {
            if(isPrime(i)&&isPrime((i+1)/2)){
                ln[i]++;
            }
        }
        for (int i = 0; i < 100000; i++) {
            ln[i+1]+=ln[i];
        }
        for (int i = 0; i < q; i++) {
            int l=sc.nextInt();
            int r=sc.nextInt();
            out.println(ln[r]-ln[l-1]);
        }
        out.close();
    }

    static boolean isPrime(int p){
        int l=(int)sqrt(p);
        for (int i = 2; i <= l; i++) {
            if(p%i==0)return false;
        }
        return true;
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static String nextLine() {
            return s.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }

        static boolean hasNext() {
            return s.hasNext();
        }
    }
}