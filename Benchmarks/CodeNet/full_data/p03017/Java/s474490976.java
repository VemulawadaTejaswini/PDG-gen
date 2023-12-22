import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        boolean flag = true;

        // 文字列の入力
        String s = sc.next();
        s = '#' + s; // 入力が１ずれているのでこれで修正
        sc.close();
            if(!canReach(n, a, c, s) || !canReach(n, b, d, s)){
                flag = false;
            }

        if((c > d) && flag) {
            flag = checkflag(n, b, d, s);
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
    public static boolean canReach(int n, int start, int goal, String s) {
        for (int i = start; i <= goal; i++) {
            if ((s.charAt(i) == '#') && (s.charAt(i + 1) == '#')) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkflag(int n, int b, int d, String s) {
        for (int i = b; i <= d; i++) {
            if (i > 0) {
                if ((s.charAt(i) == '.') && (s.charAt(i + 1) == '.') && (s.charAt(i - 1) == '.')&& b!=i+1) {
                    return true;
                }
            }
        }
        return false;
    }
}
