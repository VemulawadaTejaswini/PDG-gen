import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = gcd(A > B ? A : B, A > B ? B : A);
        int D = (int)Math.sqrt((double)C) + 1;
        int result = 1;
        for(int i = 2; i <= D && i <= C; i++){
            if(C % i == 0){
                result++;
                while(C % i == 0 && C > 1){
                    C = C / i;
                }
            }
        }
        if(C != 1){
            result++;
        }
        System.out.println(result);
        
    }
    
    public static long gcd(long a, long b){
        long c = a % b;
        if (c == 0){
            return b;
        }else{
            return gcd(b, c);
        }
    }
}
