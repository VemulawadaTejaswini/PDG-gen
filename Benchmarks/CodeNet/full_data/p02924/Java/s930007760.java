import java.util.*;

public class Main{
    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        // 標準入力
        long N = sc.nextLong();
 
        sc.close();
        long ans = 0;
        for (long i = 1;i < N;i++) {
            long temp = i+1;
            if (i!=N) 
            ans = ans + (i % temp);  
        
        }
        
       System.out.println(ans);
    }
}