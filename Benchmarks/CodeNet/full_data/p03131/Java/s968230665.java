import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int K = ni();
        int A = ni();
        int B = ni();
        
        if (A >= K) {
            println(K+1);
            return;
        }
        
        long bis = A;
        long k = K - (A-1);
        if (k % 2 == 1) {
            k--;
            bis++;
        }
        
        long d = - A + B;
        if (d <= 2) {
            println(bis + k);
        } else {
            println(bis + d*(k/2));
        }
    }

    static int    ni() { return sc.nextInt(); }
    static long   nl() { return sc.nextLong(); }
    static String n()  { return sc.next(); }
    
    static char[] nChars() { return n().toCharArray(); }
    static int[] nInts(int n) { 
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }
    static void println(Object o)  { so.println(o);}
    static void println(long l)    { so.println(l);}
    static void println(char c)    { so.println(c);}
    static void println(double d)  { so.println(d);}
    static void println(boolean b) { so.println(b);}
    
    static void print(Object o)  { so.print(o);}
    static void print(long l)    { so.print(l);}
    static void print(char c)    { so.print(c);}
    static void print(double d)  { so.print(d);}
    static void print(boolean b) { so.print(b);}
}
