import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long ans;
        if (A==0 || (A==0 && B==0)) {
            ans = 0;
        } else {
            long M = N/(A+B);
            ans = M*A+Math.min(A, N-M*(A+B));
        }
        System.out.println(ans);
    }
}
