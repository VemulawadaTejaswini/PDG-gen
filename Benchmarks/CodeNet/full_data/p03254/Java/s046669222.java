import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        long x=sc.nextLong();
        long ans=0;
        long[] a=new long[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if(a[i]<=x){
                x-=a[i];
                ans++;
            }else{
                break;
            }
        }
        if(x!=0&&ans!=0)ans--;
        out.println(ans);
    }
}