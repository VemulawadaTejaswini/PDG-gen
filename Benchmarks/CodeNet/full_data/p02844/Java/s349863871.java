import java.util.Scanner;

public class Main {
    static char[] S;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        S = sc.next().toCharArray();
        int ans = 0;
        for(int i = 0; i < 1000; i++) {
            ans += same(((i - i % 100) / 100) , (i % 100 - i % 10) / 10, i % 10);
        }
        System.out.println(ans);
    }
    static int same(int a, int b, int c) {
        for(int j = 0; j < n - 2; j++) if(S[j] - '0' == a)
                for(int k = j + 1; k < n - 1; k++) if(S[k] - '0' == b)
                        for(int l = k + 1; l < n; l++) if(S[l] - '0' == c) return 1;
        return 0;
    }
}
