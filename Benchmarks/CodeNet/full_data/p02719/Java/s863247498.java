import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        if(n%k == 0){
            System.out.println(0);
        }
        else{
            n = n % k;
            if(n > Math.abs(n-k)){
                System.out.println(Math.abs(n-k));
            }
            else{
                System.out.println(n);
            }
        }
    }
}