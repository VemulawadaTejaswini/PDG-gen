import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int[] l = new int[2];
        l[0] = sc.nextInt();
        l[1] = sc.nextInt();
        long ans =  l[0] * l[1];
        long[] s = new long[3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= l[i]; j++) {
                s[0]=l[abs(i-1)]*(long)j;
                s[1]=(l[i]-(long)j)/2*l[abs(1-i)];
                s[2]=l[0]*l[1]-s[0]-s[1];
                Arrays.sort(s);
                ans=min(ans,s[2]-s[0]);
                s[0]=l[abs(i-1)]*(long)j;
                s[1]=l[abs(1-i)]/2*(l[i]-(long)j);
                s[2]=(l[abs(1-i)]-l[abs(1-i)]/2)*(l[i]-(long)j);
                Arrays.sort(s);
                ans=min(s[2]-s[0],ans);
            }
        }
        out.println(ans);
    }
    static long sum(long[] a){
        long t=0;
        for (long k:a)t+=k;
        return t;
    }
}