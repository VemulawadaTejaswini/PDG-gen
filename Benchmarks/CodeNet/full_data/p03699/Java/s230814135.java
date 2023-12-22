import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int sum = 0;


        int[] dp  = new int[N];
        for(int i=0;i<N;i++){
            dp[i] = Integer.parseInt(sc.next());
            sum += dp[i];
        }
        
        for(int i=0;i<N;i++){
            if(sum%10 != 0) break;
            sum -=  dp[i] ;
        }

        System.out.print(sum);
        System.out.println();
    }

}