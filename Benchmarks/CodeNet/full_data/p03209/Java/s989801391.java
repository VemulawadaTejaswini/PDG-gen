import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long x = sc.nextLong()-1;
        
        long[] len = new long[51];
        len[0] = 1L;
        long[] ps = new long[51];
        ps[0] = 1L;
        
        for(int i=0; i<50; i++){
            len[i+1] = len[i]*2+3;
            ps[i+1] = ps[i]*2+1;
        }
        
        long ans = (len[n]/2 <= x) ? 1L : 0L;
        
        for(int i=n; i>=0; i--){
            if(x>=len[i]){
                ans += ps[i];
                x -= len[i];
            }else{
                x--;
            }
        }
        
        System.out.println(ans);
    }
}