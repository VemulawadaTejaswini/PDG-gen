import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int ans=0;
        int n=sc.nextInt();
        int x=sc.nextInt();
        long[] a=new long[n+1];
        for (int i = 1; i <= n; i++) {a[i]=sc.nextInt()+a[i-1];}
        Arrays.sort(a);
        for (int i = 1; i <= n; i++) {
            if(a[i]==x){
                ans=n;
                break;
            }else if(a[i]<x){
                ans++;
            }else{
                break;
            }
        }
        if(ans==n&&a[n]!=x)ans--;
        out.println(ans);
    }
}