import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long mod = 1000000000+7;
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++) b[i]=sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        long[] fac = new long[n+1];
        fac[0]=1;
        for(int i=1;i<=n;i++) fac[i]=fac[i-1]*i%mod;
        long ans = 1;
        int left = 0;
        int[] base,target;
        while(left<n){
            if(a[left]>b[left]){
                base = b;
                target = a;
            } else{
                base = a;
                target = b;
            }
            int right = left+1;
            while(right<n&&base[right]<target[left]) right++;
            ans = ans*fac[right-left]%mod;
            left = right;
        }
        System.out.println(ans);
    }
}
