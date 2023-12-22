/* package whatever; // don't place package name! */

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class Main {
    static N[] ns;
    static HashMap<MKey,Long> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        ns = new N[N];
        for(int i = 0 ; i < N;i++)
        {
            ns[i] = new N(sc.nextInt(),sc.nextInt());
        }
        //Arrays.sort(ns);
        NN = N;
        System.out.println(calculate(W,0));
    }
    static int NN;
    static long calculate(int w,int n)
    {
        if(n == NN)
            return 0;
        if(map.containsKey(new MKey(w,n)))
            return map.get(new MKey(w,n));
    
        long res = 0;
        if(w < ns[n].w) {
            res = calculate(w, n+1);
            map.put(new MKey(w,n), res);
            return res;
        }
        else
        {
            res= Math.max(ns[n].v+calculate(w-ns[n].w,n+1),
                          calculate(w,n+1));
            map.put(new MKey(w,n),res);
            return res;
        }

    }
    static class MKey implements Comparable<MKey> {
        int n ,w;

        @Override
        public int compareTo(MKey o) {
            if(w == o.w)
                return 0;
            return w>o.w?1:-1;
        }


        public MKey(int n , int w)
        {
            this.n = n;
            this.w = w;
        }

        @Override
        public boolean equals(Object obj) {
            MKey k = (MKey) obj;
            return k.n == n && k.w == w;
        }

        @Override
        public int hashCode() {
            return n+w%10000;
        }
    }
    static class N implements Comparable<N>
    {
        @Override
        public int compareTo(N o) {
            if(w == o.w)
                return 0;
            return w>o.w?1:-1;
        }

        int w,v;
        public N(int w,int v)
        {
            this.w = w;
            this.v = v;
        }

    }
}
