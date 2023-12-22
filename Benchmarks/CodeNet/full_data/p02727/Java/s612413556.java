//package solution;

import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
import java.awt.Point;

public final class Main {
    BufferedReader br;
    StringTokenizer stk;

    public static void main(String[] args) throws Exception {
        //new Thread(null, new Runnable() {
            //@Override
            //public void run() {
                //try {
                    new Main().run();
                //} catch(Exception ex) {ex.printStackTrace();}
            //}
        //}, "solution", 1<<26).start();
    }
    
    {
        stk = null;
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    //long mod = 1000000007L;
    void run() throws Exception {
        int x = ni(), y = ni(), a = ni(), b = ni(), c = ni();
        long[] red = new long[a], green = new long[b], colorless = new long[c];
        for(int i=0; i<a; i++) red[i] = nl();
        for(int i=0; i<b; i++) green[i] = nl();
        for(int i=0; i<c; i++) colorless[i] = nl();
        
        Arrays.sort(red); Arrays.sort(green); Arrays.sort(colorless);
        
        List<Long> list = new ArrayList<>();
        for(int i=a-x; i<a; i++) {
            list.add(red[i]);
        }
        for(int i=b-y; i<b; i++) {
            list.add(green[i]);
        }
        for(int i=0; i<c; i++) list.add(colorless[i]);
        Collections.sort(list, Collections.reverseOrder());
        
        long total = 0;
        for(int i=0; i<x+y; i++) total += list.get(i);
        pl(total);
    }
    
    //Reader & Writer
    String nextToken() throws Exception {
        if (stk == null || !stk.hasMoreTokens()) {
            stk = new StringTokenizer(br.readLine(), " ");
        }
        return stk.nextToken();
    }

    String nt() throws Exception {
        return nextToken();
    }

    String ns() throws Exception {
        return br.readLine();
    }

    int ni() throws Exception {
        return Integer.parseInt(nextToken());
    }

    long nl() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nd() throws Exception {
        return Double.parseDouble(nextToken());
    }

    void p(Object o) {
        System.out.print(o);
    }

    void pl(Object o) {
        System.out.println(o);
    }
}