
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long ans = computeXOR(A - 1) ^ computeXOR(B);//^ computeXOR(A - 1);
        System.out.println(ans);
    }
    private static long computeXOR(long n) {
        if(n % 4 == 0) return n;
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n + 1;
        if(n % 4 == 3) return 0;
        return 0;
    }
}