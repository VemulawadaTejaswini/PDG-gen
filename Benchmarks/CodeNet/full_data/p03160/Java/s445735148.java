import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        p[0] =0;
        p[1] =0;
        for(int j =0; j< n;j++){
            p[j] = sc.nextInt();
        }
        for(int k =0;k < n; k++) {
            System.out.println(p[k]);
        }
        long ans = 0;
        for(int i =0; i< n;i++){
            if(abs(p[i+1] - p[i]) +abs(p[i+2] -p[i])> abs(p[i+2] - p[i])){
                ans +=abs(p[i+2] - p[i]);
                i++;
            }else{
                ans +=abs(p[i+1] - p[i]);
            }
                System.out.println(ans);
        }
        System.out.println(ans);

        }
    }