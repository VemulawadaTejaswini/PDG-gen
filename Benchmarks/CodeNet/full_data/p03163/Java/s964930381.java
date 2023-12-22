import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int W = sc.nextInt();

        long[] w = new long[N];
        long[] v = new long[N];
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        System.out.println(rec(w,v,0,W, 0));
    }


    static
    long rec(long[] w,long[] v ,int i, long W, long V){


        if(i==w.length) return V;


        long max = -1;
        //use
        if(W-w[i]>=0){
            max = Math.max(max, rec(w,v,i+1,W-w[i],V+v[i] ));
        }
        //not use
        max = Math.max(max,rec(w,v,i+1, W,V ));

        return max;


    }

}