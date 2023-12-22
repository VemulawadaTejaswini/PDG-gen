import java.util.*;
import java.io.*;

public class Main {

    private static int solver(int a, int b){
        if(a == b){
            return a+b;
        }else{
            int max = Math.max(a,b);
            return max + max - 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        // int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= 1; ++i) {
            int n = in.nextInt();
            int m = in.nextInt();
            System.out.println(solver(n, m));
        }
    }
}
