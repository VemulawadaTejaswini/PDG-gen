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
        int right = W;
    if (S.charAt(N-1) == 'L') ++left;
    if (S.charAt(N-1) == 'R') --right;
        for (int i=N-2;i>=0;i--) {
            if (T.charAt(i)=='L') {
                if (right<W) right++;
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
        if (sc<left || right<=sc) {
            System.out.println("NO");
            return;
        }

        int down = 0;
        int up = H;
    if (S.charAt(N-1) == 'D') ++down;
    if (S.charAt(N-1) == 'U') --up;
        for (int i=N-2;i>=0;i--) {
            if (T.charAt(i)=='D') {
                if (up<H) up++;
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
        if (sr<down || up<=sr) {
            System.out.println("NO");
            return;
        }

        // if (left<=sc && sc<right && down<=sr && sr<up) {
        //     System.out.println("YES");
        // } else {
        //     System.out.println("NO");
        // }
        System.out.println("YES");
    }
}
