import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        long sCnt = 0;
        long tCnt = 0;
        boolean sOk = false;
        boolean tOk = false;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'S') {
                sCnt++;
            }
        }
        for (int i = x.length() - 1; i >= 0; i--) {
            if (x.charAt(i) != 'S' && i == x.length() - 1) {
                break;
            } else if (x.charAt(i) == 'T') {
                break;
            } else if (x.charAt(i) == 'S') {
                sCnt--;
            }
        }

        for (int i = x.length() - 1; i >= 0; i--) {
            if (x.charAt(i) == 'T') {
                tCnt++;
            }
        }
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != 'T' && i == 0) {
                break;
            } else if (x.charAt(i) == 'S') {
                break;
            } else if (x.charAt(i) == 'T') {
                tCnt--;
            }
        }
        long ans = Math.min(sCnt, tCnt);
        System.out.println(x.length() - 2 * ans);
    }
}
