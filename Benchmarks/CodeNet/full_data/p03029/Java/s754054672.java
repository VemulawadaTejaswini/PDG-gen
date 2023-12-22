import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static int maxn=2;
    static long[] f5ac, inv;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int a = sc.nextInt(), p = sc.nextInt();
        p += a*3;
        System.out.println(p/2);
    }
}

