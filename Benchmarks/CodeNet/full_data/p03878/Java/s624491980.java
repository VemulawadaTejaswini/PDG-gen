import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long mod = 1000000000+7;
        int n = sc.nextInt();
        int[][] dic = new int[2*n][];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            dic[i] = new int[]{a,0};
        }
        for(int i=n;i<2*n;i++){
            int b = sc.nextInt();
            dic[i] = new int[]{b,1};
        }
        Arrays.sort(dic,new myc());
        long ans = 1;
        int[] cnt = new int[2];
        for(int i=0;i<2*n;i++){
            int now = dic[i][1];
            if(cnt[1-now]>0){
                ans = ans*cnt[1-now]%mod;
                cnt[1-now]--;
            }else{
                cnt[now]++;
            }
        }
        System.out.println(ans);
    }
    static class myc implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            return a[0]-b[0];
        }
    }
}
