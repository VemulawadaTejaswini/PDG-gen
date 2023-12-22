import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong(); 
        long K = sc.nextLong(); 
        sc.nextLine();
        long n = N % K;
        long k = Math.abs(n-K);
        if (n > k) {
            System.out.println(k);
        } else {
            System.out.println(n);
        }
    }
}