import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int w = scan.nextInt();

        long[] weight = new long[n];
        long[] value = new long[n];
        for (int i = 0; i < n; i++){
            weight[i] = scan.nextInt();
            value[i] = scan.nextInt();
        }

        long[] result = new long[n];

        for (int i = 0; i < n; i++){
            for (int j = w; j >= 0; j--){
                if (j + weight[i] <= w){
                    result[j + (int)weight[i]] = Math.max(result[j + (int)weight[i]],result[j]+value[i]);
                }
               
            }
        }
        
        long res = (long)0;
        for (int i = 0; i < n; i++){
            res = Math.max(res,result[i]);
        }   
      

        System.out.println(res);

        scan.close();
    }
}   