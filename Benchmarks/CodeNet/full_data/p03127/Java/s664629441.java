import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int c=n;
        while (c>1){
            c=0;
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                int d=0;
                while (a[d]==0){
                    d++;
                }
                if(d==n-1)break;
                a[i]%=a[d];
            }
        }
        out.println(a[n-1]);
    }
}