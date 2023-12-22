import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static long mod = 1000000000+7;
    static int maxn = 1000*1000;
    static long[] fac = new long[1000*1000+1], inv = new long[1000*1000+1];
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        // 原有想法是错的，很难得到正确结果。
        // 应该从每一个值填坑的角度来思考
        int n = sc.nextInt(),m = sc.nextInt();
        int[] a = new int[n], b=new int[m];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<m;i++) b[i]=sc.nextInt();
        System.out.println(help(n,m,a,b));
    }
    static long help(int n, int m, int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        if(a[n-1]!=n*m||b[m-1]!=n*m) return 0;
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]) return 0;
        }
        for(int j=0;j<m-1;j++){
            if(b[j]==b[j+1]) return 0;
        }
        long ans = 1;
        for(int k=n*m;k>0;k--){
            int i=Arrays.binarySearch(a,k);
            int j=Arrays.binarySearch(b,k);
            if(i>=0&&j>=0) continue;
            if(i>=0&&j<0){
                j = -(j+1);
                ans = ans*(m-j)%mod;
            }else if(i<0&&j>=0){
                i = -(i+1);
                ans = ans*(n-i)%mod;
            }else{
                j = -(j+1);
                i = -(i+1);
                ans = ans*((n-i)*(m-j)-(n*m-k))%mod;
            }
        }
        return ans;
    }
}
