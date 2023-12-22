import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int X=sc.nextInt();
        long ans=0;
        int[] x=new int[n+1];
        x[0]=0;
        for (int i = 1; i <= n; i++) {
            x[i]=sc.nextInt();
        }
        ans+=x[n];
        for (int i = n; i >0 ; i--) {
            ans+=X+(n-i+2)*(n-i+2)*(x[i]-x[i-1]);
        }
        ans+=X;
        out.println(ans);
    }
}