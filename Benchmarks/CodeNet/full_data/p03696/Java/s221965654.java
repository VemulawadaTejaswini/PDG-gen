import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String ans = "";
        int cnt = 0;
        int r = 0;
        boolean ri = false;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ')') { // )
                if (cnt == 0) {
                    ans = "(" + ans + ")";
                } else {
                    ri = true;
                    r++;
                    if (cnt == r) {
                        String tmp = "";
                        for (int j = 0; j < r; j++) {
                            tmp = "(" + tmp + ")";
                        }
                        ans = ans + tmp;
                        r = 0;
                        cnt = 0;
                    }
                }
            } else {// (
                if (ri) {
                    String tmp = "";
                    for (int j = 0; j < cnt; j++) {
                        tmp = "(" + tmp + ")";
                    }
                    ans = ans + tmp;
                    r = 0;
                    cnt = 0;
                    ri = false;
                }
                cnt++;
            }
            if (i == n - 1) {
                String tmp = "";
                for (int j = 0; j < cnt; j++) {
                    tmp = "(" + tmp + ")";
                }
                ans = ans + tmp;

            }

        }
        System.out.println(ans);
        sc.close();
    }
}
