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

class Main {

    public static void main(String args[]) {
        try {
            FastReader s = new FastReader();
            BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
            int i, j, k, v, x, y, t, n, key, size, poster, minglob, minloc, beg, end, begl, endr, ind, max, l, r;
            long ans, f, ansmin, count, mincount;
            boolean flag;

            //n = s.nextInt();
            //k = s.nextInt();
            //TreeSet<Integer> ts = new TreeSet<Integer>();
            //int arr[] = new int[n];
            String str = s.nextLine();
            String str2 = s.nextLine();
            
            

            count = 0l;
            for(i=0; i<3; i++)
                if(str.charAt(i)==str2.charAt(i))
                    count++;
                

            w.write(count + "\n");
            w.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// ========================================### FAST IO
// ###=========================================//
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