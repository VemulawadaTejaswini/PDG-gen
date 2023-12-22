import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        for(int i=0;i<N;i++){
            w[N-i-1] = sc.nextInt();
            v[N-i-1] = sc.nextInt();
        }

        System.out.println(func(w,v,N, W ,0));
    }

    static private long func(int[] w, int[] v,int N , int W , int idx){
        if(idx == N ) return 0;
        if(W-w[idx] < 0) return func(w,v,N, W, idx +1  );

        long result =  Math.max(
                func(w,v,N, W- w[idx], idx +1  )  + v[idx] ,
                func(w,v,N, W, idx +1  ));

        return result;

    }

}
