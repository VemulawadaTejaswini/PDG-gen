import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long quotient = n / (a + b);
        long mod = n % (a + b);
        if(a<=mod){
            System.out.println(quotient*a + a);
        }else {
            System.out.println(quotient*a + mod);
        }
    }
}