import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String s = scanner.next();
        int st = 1, ans = 0;
        while(st < N && s.charAt(st) == s.charAt(st - 1)) {
            st++;
        }
        for(int i = st; i < (N - 1); i++) {
            if(K > 0 && s.charAt(i) != s.charAt(i + 1)) {
                ans += 2;
                i++;
                K--;
            }
        }
        if(K > 0 && st < N && ans < (N - 1))
            ans++;
        for(int i = 1; i < N; i++) {
            if(s.charAt(i) == s.charAt(i - 1))
                ans++;
        }
        System.out.println(ans);
    }
}