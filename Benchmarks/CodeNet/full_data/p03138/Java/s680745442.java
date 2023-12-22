import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String kp = Long.toBinaryString(sc.nextLong() + 1L);
        List<Long> ai = new ArrayList<Long>(n) {{
            for (int i = 0; i < n; i++) {
                add(sc.nextLong());
            }
        }};
        int nh = n/2 + n%2;
        long unit = Math.round(Math.pow(2, kp.length()-1));
        long ans = 0L;
        boolean isSmall = false;
        int j = kp.length() - 1;
        for (int i = 0; i < kp.length(); i++) {
            int one = 0;
            for (long a : ai) {
                one += (a >> j) & 1L;
            }
            boolean flag = kp.charAt(i)=='1';
            if( one >= nh ) {
                ans += unit * one;
                if( flag ) isSmall = true;
            } else {
                if( !flag & !isSmall ) {
                    ans += unit * (long)one;
                } else {
                    ans += unit * (long)(n-one);
                }
            }
            j--;
            unit /= 2L;
        }
        System.out.println(ans);
    }
}
