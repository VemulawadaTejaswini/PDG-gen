import java.io.*;
import java.util.*;
import java.lang.Math.*;

class Main{

    static int N;
    static int M;

    static ArrayList< ArrayList<Integer> > mData = new ArrayList< ArrayList<Integer> >(100000);

    static int[] dp = new int[100000];

    static int f(int v){
        if( dp[v] != -1 ) return dp[v];
        if( mData.get(v).isEmpty() ){
            dp[v] = 0;
            return 0;
        }      
        /*  
        if( mData.get(v).size() == 1 && f( mData.get().get(0) ) == 0 ){
            dp[v] = 1;
            return 1;
        }
        */
        int res = f( mData.get(v).get(0) );
        for(int i = 1; i < mData.get(v).size(); i++){
            res = Math.max( res, f( mData.get(v).get(i) ) );
        }
        dp[v] = res + 1;
        return res + 1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        for(int i = 0; i < N; i++){
            mData.add( new ArrayList<Integer>() );
            dp[i] = -1;
        }

        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
        
            mData.get(a-1).add(b-1);
        }

    /*
        //ispis grafa
        for(int i = 0; i < N; i++){
            int ii = i+1;
            System.out.print("\n" + i + ":  ");
            for(int j = 0; j < mData.get(i).size(); j++){
                System.out.print( mData.get(i).get(j) + " " );
            }
        }
    */

        int res = 0;
        for(int i = 0; i < N; i++){
            res = Math.max( f(i), res );
        
        }

        System.out.println(res);
        sc.close();    
    }
}
