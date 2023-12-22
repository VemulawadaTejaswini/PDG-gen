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
            System.out.println(s.replaceAll("[^x]", "").length());
            return;
        }
        int ans = 0;
        int sleft = 0, sright = s.length() - 1;
        int eleft, eright;
        int i = 0;
        while(sleft < sright) {
            i = sleft;
            while(s.charAt(i) == 'x') {i++;}
            eleft = i; i = sright;
            while(s.charAt(i) == 'x') {i--;}
            eright = i;
            ans += Math.abs((eleft - sleft) - (sright - eright));
//            System.out.println(sleft + " " + eleft + " " + eright + " " + sright);
            sleft = eleft + 1;
            sright = eright - 1;
            
//            System.out.println(ans);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().solve();
    }
}
