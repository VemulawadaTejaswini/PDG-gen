import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();    
        String S = stdIn.next();
        stdIn.close();
        int[] a = new int[N];
        int[] cnt = {0, 0, 0};
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R') {
                a[i] = 0;
                cnt[0]++;
            }
            if (S.charAt(i) == 'G') {
                a[i] = 1;
                cnt[1]++;
            }
            if (S.charAt(i) == 'B') {
                a[i] = 2;
                cnt[2]++;
            }
        }
        int ans = cnt[0] * cnt[1] * cnt[2];
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < j; i++) {
                int k = j + (j - i);
                if (k <= N) {
                    if (a[i] == a[j]) continue;
                    if (a[i] == a[k]) continue;
                    if (a[k] == a[j]) continue;
                    ans--;
                }
            }
        }
        System.out.println(ans);        
    }
}