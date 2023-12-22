

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");
            long[] A = new long[n];
            for(int i = 0; i < n ; i++) {
                A[i] = Integer.parseInt(str.nextToken());
            }
            int c1 = func(A,1,n);
            int c2 = func(A,-1,n);
            System.out.println(Math.min(c1,c2));

        } catch (IOException e) {
            System.out.println("error");
        }
    }
    static int func(long[] A,int flg,int n){
        long sum = 0;
        int c = 0;
        for(int i = 0; i < n; i++){
            sum += A[i];
            if(flg == 1){   //次は負
                if(sum >= 0){
                    c += (sum + 1);
                    sum = -1;
                }
                flg = -1;
            }
            else{       //次は正
                if(sum <= 0){
                    c += 1+ (-sum);
                    sum = 1;
                }
                flg = 1;
            }
        }
        return c;
    }
}