
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] h = new long[n];
        for(int i=0;i<n;i++){
            h[i] = sc.nextLong();
        }
        long prev = h[0];
        int res =0;
        int now = 0;
        for(int i=1;i<n;i++){
            if(prev>=h[i]){
                now++;
            }
            else{
                now = 0;
            }
            if(res<now){
                res=now;
            }
            prev=h[i];
        }
        System.out.println(res);

    }
}