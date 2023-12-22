import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n,k,subtraction;

        n = sc.nextLong();
        k = sc.nextLong();
        
        subtraction = n - ((n / k) * k);
        
        
        if(subtraction >= Math.abs(subtraction - k)){
            subtraction = Math.abs(subtraction - k);
        }
        
        System.out.println(subtraction);
    }
}
