import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String a = sc.next();
        char[] S = a.toCharArray();
        int[] s = new int[N];
        int[] s1=new int[N];
        Arrays.fill(s, 0);
        Arrays.fill(s1,0);
        for (int i = 1; i < N; i++) {
            if (S[i - 1] == 'E') {
                s[i] = s[i - 1] + 1;
            }else{
                s[i]=s[i-1];
            }
        }
        for (int i = N - 2; i >= 0; i--) {
            if (S[i + 1] == 'W') {
                s1[i] = s1[i + 1] + 1;
            }else{
                s1[i]=s1[i+1];
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(s[i]+s1[i], ans);
        }
        System.out.println(N-ans-1);
    }
}
