import java.util.*;

class A {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int[] t = new int[N];
        for(int i = 0; i < t.length; i++)
            t[i] = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < N; i++)
            if(t[i] < A || B <= t[i])
                ans++;
        System.out.println(ans);
    }
}

public class Main {
    public static void main(String... args) {
        A.main();
    }
}