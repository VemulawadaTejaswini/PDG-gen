import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        sc.close();

        int ans = 0;
        if (A%2==B%2) {
            ans = (B-A)/2;
        } else if (B<N/2) {
            ans = B-1;
        } else if (A>N/2) {
            ans = N-A;
        } else {
            ans = Math.min(N-A, B-1);
        }

        System.out.println(ans);
    }
}