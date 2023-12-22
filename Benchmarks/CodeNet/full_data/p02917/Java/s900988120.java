import java.util.*;
import java.lang.*;

public class Main {
    static class pair{
        double f,s;
        pair(double f,double s){
            this.f=f;
            this.s=s;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int B[]=new int[n-1];
        for (int i = 0; i < n-1; ++i)
            B[i]=in.nextInt();

        long  ans = (B[0] + B[n-2]);

        for (int i = 1; i < n-1; ++i)
        {
            ans += Math.min(B[i],B[i-1]);
        }
        System.out.println(ans);
        in.close();
    }
}
