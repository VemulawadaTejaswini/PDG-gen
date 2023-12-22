import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x= new int[n+1];
        for(int i=1;i<=n;i++) x[i]=sc.nextInt();
        long mod = 1000000000+7;
        long ans = 1;
        if(n<=2){
            System.out.println(n);
            return;
        }
        int done=0,i=3;
        while(done<n){
            while(i<=n&&x[i-1]>=2*(i-1-done)-1) i++;
            ans = ans*(i-1-done)%mod;
            done++;
        }
        System.out.println(ans);
    }
}
