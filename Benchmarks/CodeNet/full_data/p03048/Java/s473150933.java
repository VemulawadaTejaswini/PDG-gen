import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static int n,a,b,k;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
        long ans = 0;
        for(int i=0;i<=n/r;i++){
            for(int j=0;j<=n/g;j++){
                if(i*r+j*g>n) break;
                if((n-i*r-j*g)%b==0) ans++;
            }
        }
        System.out.println(ans);
    }
}

