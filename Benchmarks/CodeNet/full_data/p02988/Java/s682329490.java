import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n+2];
        int count =0;
        //格納
        for(int i=0; i < n; i++){
            p[i] = sc.nextInt();
        }
        p[n] = p[n-2];
        p[n+1]= p[n-1];

        //判定
        for(int k = 0; k < n;k++){
            if((p[k]>p[k+1] && p[k+1]>= p[k+2] )|| (p[k]<=p[k+1] && p[k+1]< p[k+2])){
                count++;
            }
        }
        //出力
        System.out.println(count);
    }
}

