import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int A[] = new int[N];
        for (int i=0; i<N; i++) {
            A[i] =  Integer.parseInt(sc.next());
        }
        sc.close();

        int cnt = 1;
        int ans = 0;
        for (int i=0; i<N; i++) {
            if (cnt==A[i]) {
                cnt++;
            } else {
                ans++;
            }
        }

        if (ans==N)
            ans = -1;

        System.out.println(ans);
    }
}