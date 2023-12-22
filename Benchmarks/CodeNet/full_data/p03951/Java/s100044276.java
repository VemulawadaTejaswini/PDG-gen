import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private boolean check(int i, char[] c, char[] s) {
        int base = i;
        for (int j = 0; j < s.length; j++) {
            if (c[base + j] != s[j]) return false;
        }
        return true;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        int cnt = 0;
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            String pre = s.substring(s.length() - (i + 1), s.length());
            String suf = t.substring(0, i + 1);
            if (pre.equals(suf)) {
                //System.out.println("ok: cnt:" + pre.length());
                cnt = Math.max(cnt, pre.length());
            }
        }

        System.out.println(Math.max(N, s.length() + t.length() - cnt));
        
        return;
    }

}