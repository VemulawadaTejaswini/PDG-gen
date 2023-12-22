
import java.util.*;

public class Main {


    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int[] candle = new int[n];
        for (int i = 0; i < n;i++)
            candle[i] = sc.nextInt();
        int index =0;
        for (; index < n;index++)
            if (candle[index]>= 0)
                break;
        int min =Integer.MAX_VALUE;
        if (index == n){
            System.out.println(-candle[n-k]);
            return;
        }
            
        for(int i =0; i< k; i++){
            int l = abs(i,index-1,  candle, -1);
            int r = abs(k-i,index+1,  candle, 1);
            if(r==0 || l == 0)
                min = Math.min(min, Math.max(l,r));
            else {
                int t = l< r + candle[index]? l*2 + r : l+ r*2;
                min = Math.min(min, t);
            }

        }
        System.out.println( min);

    }

    public static int abs(int left, int index, int[] candle, int dir){
        if (index < 0 || index >= candle.length)
            return 0;
        if (left== 0)
            return 0;
        if (left == 1)
            return Math.abs(candle[index]);
        if (dir< 0){
            return abs(left-1, index-1, candle,dir);
        }
        else{
            return abs(left-1, index+1, candle,dir);
        }
    }



}