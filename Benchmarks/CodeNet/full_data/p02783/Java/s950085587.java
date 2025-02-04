                    ////////////////////////////////////////////////////
                    //                                                //
                    //  For her who keeps the fire kindling in me...  //
                    //                                                //
                    ////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.Collections; 
// import java.util.StringTokenizer;
import java.util.*;
import java.lang.Math;
import java.awt.Point;

import java.awt.geom.*;

public class Main {

    public static void main(String args[]) {
        try {
            FastReader s = new FastReader();
            BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
            int i, j;
            int m, n, t, max, k, x, y, min, correct_ans, vert, num, size, local_ans, global_ans;
            long a, b, sum;


            n = s.nextInt();
            m = s.nextInt();
            
            // a = s.nextLong();
            // b = s.nextLong();
           
            w.write((int)Math.ceil((float)n/m)+"\n");
            w.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// ========================================### FAST IO ###=========================================//
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    Double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
// ====================================================================================================//