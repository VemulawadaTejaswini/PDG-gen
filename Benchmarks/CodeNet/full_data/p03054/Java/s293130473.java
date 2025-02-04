import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int N = scan.nextInt();
        int sr = scan.nextInt()-1;
        int sc = scan.nextInt()-1;
        String S = scan.next();
        String T = scan.next();

        int left = 0;
        int right = W-1;
        for (int i=N-1;i>=0;i--) {
            if (T.charAt(i)=='L') {
                if (right<W-1) right++;
            } else if (T.charAt(i)=='R') {
                if (left>0) left--;
            }

            if (S.charAt(i)=='L') {
                left++;
            } else if (S.charAt(i)=='R') {
                right--;
            }

            if (right<=left) {
                System.out.println("NO");
                return;
            }
        }

        int down = 0;
        int up = H-1;
        for (int i=N-1;i>=0;i--) {
            if (T.charAt(i)=='D') {
                if (up<H-1) up++;
            } else if (T.charAt(i)=='U') {
                if (down>0) down--;
            }

            if (S.charAt(i)=='D') {
                down++;
            } else if (S.charAt(i)=='U') {
                up--;
            }

            if (up<=down) {
                System.out.println("NO");
                return;
            }
        }

        if (left<=sc && sc<=right && down<=sr && sr<=up) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
