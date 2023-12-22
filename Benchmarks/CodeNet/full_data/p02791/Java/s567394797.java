import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        int ans = 0;
        boolean Flag = true;

        for (int i = 0; i < N; i++) {
            Flag = true;
            for (int j = 0; j < (P.length-(P.length-i)); j++) {
                if(P[i] > P[j]) {
                    Flag = false;
                }
            }

            if(Flag) ans++;
        }

        System.out.println(ans);

    }
}

