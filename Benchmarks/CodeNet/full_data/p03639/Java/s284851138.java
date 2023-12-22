import java.util.*;
import java.io.*;
public class Main {
    void solve(BufferedReader in) throws Exception {
        int n = toInt(in.readLine());
        int[] a = toInts(in.readLine());
        int d2 = 0;
        int d4 = 0;
        int d1 = 0;
        for(int x: a) {
            if(x%4 == 0) d4++;
            else if(x%2 == 0) d2++;
            else d1++;
        }
        if(d2 != 0) d1++;
        if(d4 >= d1 - 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
    int toInt(String s) {return Integer.parseInt(s);}
    int[] toInts(String s) {
        String[] a = s.split(" ");
        int[] o = new int[a.length];
        for(int i = 0; i<a.length; i++) o[i] = toInt(a[i]);
        return o;
    }
    void e(Object o) {
        System.err.println(o);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        (new Main()).solve(in);
    }
}
