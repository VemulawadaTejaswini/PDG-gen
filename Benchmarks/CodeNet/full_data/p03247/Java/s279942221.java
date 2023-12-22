import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] X = new long[(int)(N)];
        long[] Y = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                X[i] = sc.nextLong();
                Y[i] = sc.nextLong();
        }
        solve(N, X, Y);
    }

    static void solve(long N, long[] X, long[] Y){
        long[] D = new long[(int)(N)];
        long max_D = 0, max_X = 0, max_Y = 0;
        for(int i = 0 ; i < N ; i++){
            D[i] = Math.abs(X[i]) + Math.abs(Y[i]);
            if(max_D < D[i]) max_D = D[i];
            if(max_X < X[i]) max_X = X[i];
            if(max_Y < Y[i]) max_Y = Y[i];
            if(i > 1 && D[i] % 2 != D[i-1] % 2){
                System.out.println("-1");
                System.exit(0);
            }
        }
        System.out.println(max_D);
        long d = 1;
        for(int i = 0 ; i < max_D-1 ; i++) System.out.print(d + " ");
        System.out.print(d);
        System.out.println("");
        int c = 0;
        for(int i = 0 ; i < N ; i++){
            if(X[i] >= 0) {
                for(int j = 0 ; j < X[i] ; j++ ){
                    System.out.print("R");
                    c++;
                }
            }else{
                for(int j = 0 ; j < Math.abs(X[i]) ; j++ ){
                    System.out.print("L");
                    c++;
                }
            }
            if(Y[i] >= 0){
                for(int j = 0 ; j < Y[i] ; j++ ){
                    System.out.print("U");
                    c++;
                }
            }
            else{
                for(int j = 0 ; j < Math.abs(Y[i]) ; j++ ){
                    System.out.print("D");
                    c++;
                }
            }
            for(int j = 0 ; j < (max_D-c)/2 ; j++ ){
                System.out.print("R");
                System.out.print("L");
            }
            System.out.println("");
        }
    }
}
