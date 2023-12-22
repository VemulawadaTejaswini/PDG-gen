import java.util.*;


class Main {

    private static boolean can_jump(String str) {
        int n = str.length();
        if (n <= 2) {
            return false;
        }

        for (int i = 1; i < n; i++) {
            char v1 = str.charAt(i);
            char v2 = str.charAt(i - 1);
            if (v1 - v2 != 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean can_jump2(String str) {
        int n = str.length();
        if (n <= 2) {
            return false;
        }

        for (int i = n - 1; i >= 0; i--) {
            char v = str.charAt(i);
            if (i == n - 1) {
                if (v == '1') {
                    return false;
                }
            } else {
                if (v != '9') {
                    return false;
                }
            }
        }
        return true;
    }



    private static long next(long v) {
        String prevstr = String.valueOf(v);
        String str = String.valueOf(v + 1);
        int n = str.length();

        if (str.length() == 1) {
            return Integer.parseInt(str);
        }

        while (true) {
            if (can_jump(String.valueOf(v))) {
                n = prevstr.length();
                int digit = 8;
                while(n > 2) {
                  n--;
                  digit *= 10;
                }
                v+=digit;
                //System.out.println(String.format("%d %d", digit, v));
                //v++;
            } else {
                v++;
            }
            //System.out.println(String.format("v: %d", v));
            str = String.valueOf(v);
            n = str.length();
            boolean is_lunlun = true;

            for (int i = 1; i < n; i++) {
                int v1 = str.charAt(i);
                int v2 = str.charAt(i - 1);
                int diff = Math.abs(v1 - v2);
                if (diff > 1) {
                    is_lunlun = false;
                    break;
                }
            }
            if (is_lunlun) return v;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        long ans = 0;
        for (int i = 0; i < K; i++) {
            ans = next(ans);
            //System.out.println(String.format("%d %d", i, ans));
        }
        System.out.println(ans);
    }
}
