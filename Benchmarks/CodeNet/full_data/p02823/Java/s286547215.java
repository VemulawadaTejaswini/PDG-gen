import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        long ans = 0;
        long dist = Math.abs(A - B);
        if (dist % 2 == 0) {
            ans = dist / 2;
        } else {
            ans = Math.min(
                    N - Math.min(A, B), Math.max(A, B) - 1
            );
        }

        System.out.println(ans);
    }
}