import java.util.*;
import java.io.*;

public class Main {

    private static int solver(int[] m){
        int ans=1;
        int height = m[0];
        for(int i=1; i<m.length;i++){
            if(height <= m[i]) {
                height = m[i];
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        int[] m = new int[t];
        for (int i = 1; i <= t; ++i) {
            m[i-1] =  in.nextInt();
        }
        System.out.println(solver(m));
    }
}
