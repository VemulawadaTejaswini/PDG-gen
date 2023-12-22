import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int ans = 0;
        for (int n = 0; n <= 999; n++) {
            int n1 = n/100;
            int n2 = (n-n1*100)/10;
            int n3 = n%10;
            // n1
            int n1i = -1;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == (char)('0' + n1)) {
                    n1i = i;
                    break;
                }
            }
            if (n1i == -1) {
                continue;
            }
            // n2
            int n2i = -1;
            for (int i = n1i+1; i < N; i++) {
                if (S.charAt(i) == (char)('0' + n2)) {
                    n2i = i;
                    break;
                }
            }
            if (n2i == -1) {
                continue;
            }
            // n3
            int n3i = -1;
            for (int i = n2i+1; i < N; i++) {
                if (S.charAt(i) == (char)('0' + n3)) {
                    n3i = i;
                    break;
                }
            }
            if (n3i == -1) {
                continue;
            }

            ans++;
        }
        
        System.out.println(ans);
    }
}
