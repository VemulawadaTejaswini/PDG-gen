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
        
        TreeMap<Long, Integer> cred = new TreeMap<>();
        TreeMap<Long, Integer> cgreen = new TreeMap<>();
        for(int i=a-x; i<a; i++) {
            long num = red[i];
            if(!cred.containsKey(num)) cred.put(num, 0);
            cred.put(num, cred.get(num) + 1);
        }
        for(int i=b-y; i<b; i++) {
            long num = green[i];
            if(!cgreen.containsKey(num)) cgreen.put(num, 0);
            cgreen.put(num, cgreen.get(num) + 1);
        }
        
        for(int i=0; i<c; i++) {
            long elem = colorless[i];
            Long r = cred.lowerKey(elem);
            Long g = cgreen.lowerKey(elem);
            if(r != null && g != null) {
                if(r < g) {
                    reduce(cred, r);
                    if(!cred.containsKey(elem))
                        cred.put(elem, 0);
                    cred.put(elem, cred.get(elem) + 1);
                } else {
                    reduce(cgreen, g);
                    if(!cgreen.containsKey(elem))
                        cgreen.put(elem, 0);
                    cgreen.put(elem, cgreen.get(elem) + 1);
                }
            } else if(r != null) {
                reduce(cred, r);
                if(!cred.containsKey(elem))
                    cred.put(elem, 0);
                cred.put(elem, cred.get(elem) + 1);
            } else if(g != null) {
                reduce(cgreen, g);
                if(!cgreen.containsKey(elem))
                    cgreen.put(elem, 0);
                cgreen.put(elem, cgreen.get(elem) + 1);
            }
        }
        
        long total = 0;
        for(long key : cred.keySet()) total += (long) cred.get(key) * key;
        for(long key : cgreen.keySet()) total += (long) cgreen.get(key) * key;
        pl(total);
    }
    
    void reduce(TreeMap<Long, Integer> map, long val) {
        if(map.get(val) == 1) map.remove(val);
        else {
            map.put(val, map.get(val) - 1);
        }
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