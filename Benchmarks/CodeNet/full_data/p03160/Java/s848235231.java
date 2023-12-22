import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n+2];
        p[0] =sc.nextInt();
        p[1] =p[0];
        p[2] = p[0];
        long[] ans = new long[n+2];
        ans[0] = 0;
        for(int j =3; j< n+2;j++){
            p[j] = sc.nextInt();
        }


        for(int i =1; i< n+1;i++){
            if(abs(ans[i-1] + p[n+2-i] - p[n+1-i])>= ans[i-1] +  abs(p[n+2-i] - p[n-i])){
                ans[i] = ans[i-1] + abs(p[n-i+2] - p[n-i]);
                i++;
            }else{
                ans[i] = ans[i-1] + abs(p[n-i+2] - p[n-i+1]);
            }

//            System.out.println(ans);
       }
        System.out.println(ans[n+2]);

        }
    }
//
//     for(int i =1; i< n+1;i++){
//        if(abs(p[n+2-i] - p[n+1-i]) +abs(p[n+1-i] -p[n-i])> abs(p[n+2-i] - p[n-i])){
//        ans +=abs(p[n-i+2] - p[n-i]);
//        i++;
//        }else if(abs(p[n+2-i] - p[n+1-i]) +abs(p[n+1-i] -p[n-i])> abs(p[n+2-i] - p[n+1-i])+ abs(p[n+1-i] - p[n-1-i])){
//        ans +=abs(p[n-i+2] - p[n-i+1]);
//        }else{
//        ans +=abs(p[n-i+2] - p[n-i+1]);
//        }