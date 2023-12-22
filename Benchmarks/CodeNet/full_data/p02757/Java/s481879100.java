import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long result = 0;
        int N;
        int P;
        String S;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            P = sc.nextInt();
            S = sc.next();
        }
        int[] iS = new int[N];
        char[] c = S.toCharArray();
        for(int i = 0;i < N;i++){
            iS[i] = c[i]-0x30;
        }

        int index = 0;
        int[] before =new int[N];
        for (int i = 0; i < N; i++) {
            before[i] = 0;
        }
        while(index < N ) {
            int[] dp = new int[N];
            for (int i = index; i < N; i++) {
                dp[i] = ((before[i] * 10) + iS[i]) % P;
            }
            for (int i = index; i < N; i++) {
                if (dp[i] == 0) {
                    result++;
                }
            }
            before = new int[N];
            for (int i = index; i < N-1; i++) {
                before[i+1] = dp[i];
            }
            index++;
        }
        System.out.println(result);
        return;
    }
}
