import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] a = new int[length];
        int[] b  = new int[length];
        int[] c =  new int[length];
        
        for (int i = 0; i < length; i++){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
            c[i] = scan.nextInt(); 
        } 

        //int[] last_action = new int[length];
        //int[] result = new int[length];
        
        int[] sum_a = new int[length];
        int[] sum_b = new int[length];
        int[] sum_c = new int[length];
        
        //result[0] = a[0];
        //last_action[0] = 1;
        sum_a[0] = a[0];
        sum_b[0] = b[0];
        sum_c[0] = c[0];
        
        for (int i = 1; i < length; i++){
            int aa = -999999999;
            int bb = -999999999;
            int cc = -999999999;
            //int action = -999999999;
            //int max = 0;
                
            /*if(last_action[i - 1] == 1){*/
                 //aa = Math.max(aa,sum_a[i - 1] + (int)Math.max(b[i],c[i]));
                 aa = Math.max(aa,sum_b[i - 1] + a[i]);
                 aa = Math.max(aa,sum_c[i - 1] + a[i]);
                 

            //}else if (last_action[i - 1] == 2){
                bb = Math.max(bb,sum_a[i - 1] + b[i]);
                 //bb = Math.max(bb,sum_b[i - 1] + (int)Math.max(a[i],c[i]));
                 bb = Math.max(bb,sum_c[i - 1] + b[i]);
                 
               
            //}else if (last_action[i - 1] == 3){
                cc = Math.max(cc,sum_a[i - 1] + c[i]);
                cc = Math.max(cc,sum_b[i - 1] + c[i]);
                //cc = Math.max(cc,sum_c[i - 1] + (int)Math.max(a[i],b[i]));
                
            

            //sum_a[i] = sum_b[i - 1] + sum_a[i - 1];
            // sum_c[i - 1] + sum_a[i - 1];

            sum_a[i] = aa;
            sum_b[i] = bb;
            sum_c[i] = cc;
            /*
            if (aa >= bb){
                if (aa >= cc){
                    if (b[i] >= c[i]){
                        action = 2;
                    }else{
                        action = 3;
                    }
                    max = aa;
                }else{
                    max = cc;
                    if (a[i] >= b[i]){
                        action = 1;
                    }else{
                        action = 2;
                    }
                }
            }else{
                if (bb >= cc){
                    if (a[i] >= c[i]){
                        action = 1;
                    }else{
                        action = 3;
                    }
                    max = bb;
                }else{
                    max = cc;
                    if (a[i] >= b[i]){
                        action = 1;
                    }else{
                        action = 2;
                    }
                }
            }
            result[i] = max;
            last_action[i] = action; */
        }
        
        System.out.println((int)Math.max(Math.max(sum_a[length - 1],sum_b[length - 1]),sum_c[length - 1]));
        //for (int j = 0; j < result.length; j++){
        //    System.out.println(sum_a[j]+" "+sum_b[j]+" "+sum_c[j]);
        //}
        scan.close();
    }
}