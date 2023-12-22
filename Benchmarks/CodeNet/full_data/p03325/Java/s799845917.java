import java.util.*;
import java.awt.*;
import java.math.BigInteger;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        long[] a=new long[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
        }
        int ans=0;
        int c=0;
        while(c==0){
            ans++;
            for (int i = 0; i < n; i++) {
                if(a[i]%2==0){a[i]/=2;}else{a[i]*=3;c++;}
            }
            if(c==n){
                c=1;
            }else{
                c=0;
            }
        }
        out.println(ans);
    }
}