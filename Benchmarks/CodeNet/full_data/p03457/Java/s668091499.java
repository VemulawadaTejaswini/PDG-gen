import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.io.PrintWriter;
import java.io.OutputStream;

public class Main {
    // 標準入力
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 標準入力数値配列用 int
    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    // 標準入力数値配列用 integer ソート用
    static Integer[] inputvalInteger() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        Integer[] intarray = new Integer[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = Integer.parseInt(br.readLine().trim());
        int oldx = 0;
        int oldey = 0;
        int oldt = 0;
        for (int i=0;i<n;i++){
            int [] inputval = inputval();
            int t = inputval[0] - oldt;
            int x = inputval[1];
            int y = inputval[2];
            int dist = Math.abs(x-oldx)+Math.abs(y-oldey);
            if (dist > t || (t-dist) % 2 !=0){
                System.out.println("No");
                return;
            }
            oldx = x;
            oldey = y;
            oldt = inputval[0];

        }

        System.out.println("Yes");
    }

}

