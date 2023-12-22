import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static long A,B;
    //static int[] A,B;
    static HashSet<Integer>[] graph;
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);
        A = sc.nextLong(); B = sc.nextLong();
        if(B==0){
            System.out.println(0);
            return;
        }
        long ans;
        if(A<=1) ans = solve(B);
        else ans = solve(B)^solve(A-1);
        System.out.println(ans);
    }
    static long solve(long B){
        long ans = 0;
        long back = B;
        back = back%4;
        if(back==1||back==2) ans = 1;
        for(int i=1;i<50;i++){
            long cur  = 1L<<i;
            if(cur>B) break;
            long backup = B-(cur-1);
            long remain = backup%(2*cur);
            if(remain<cur&&remain%2==1) ans += cur;
        }
        return ans;
    }
}