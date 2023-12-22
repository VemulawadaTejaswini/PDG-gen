import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        long n=sc.nextLong();
        int a=sc.nextInt();
        int[] x=new int[(int)n];
        long ans=0;
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt()-a;
        }
        for (long i = 1; i < ((long)1<<n); i++) {
            long temp=0;
            for (long j = 0; j < n; j++) {
                if((1&(i>>j))==1){
                    temp+=x[(int)j];
                }
            }
            if(temp==0)ans++;
        }
        out.println(ans);
    }
}