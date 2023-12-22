import java.util.Scanner;

public class Main {
    static Scanner in;

    void solve() {
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s.replace("x", ""));
        String s2 = sb.toString();
        if (s.equals(s2)) {
            System.out.println(0);
            return;
        }
        if (!s.replace("x", "").equals(s2)) {
            System.out.println(-1);
            return;
        }
        if(s2.length() == 1) {
            System.out.println(s.length() - s.indexOf(s2));
            return;
        }
        int ans = 0;
        while(s.length() > 1) {
            int left = 0, right = s.length() - 1;
            while(s.charAt(left) == 'x') {left++;}
            while(s.charAt(right) == 'x') { right--;}
            ans += Math.abs(left - (s.length() - right - 1));
            s = s.substring(left, right);
            System.out.println(s);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().solve();
    }
}
