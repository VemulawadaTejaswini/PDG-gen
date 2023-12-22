import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[1001];
        
        for(int x=2;x<=n;x++){
            int y = x;
            int i = 2;
            while(y != 1) {
                if(y % i == 0) {
                    count[i]++;
                    y /= i;
                }
                else {
                    i++;
                }
            }
        }
        
        long ans = 1;
        for (int i=2; i<=n; i++){
            ans = (ans*(count[i]+1)) % 100000007;
                                       
        }
        System.out.println(ans);
        
    }
    
}
