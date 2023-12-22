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
        String harfleft = s2.substring(0, s2.length() / 2 + s2.length() % 2);
        String harfright = s2.substring(s2.length() / 2 + s2.length() % 2);
        int h = 0, h2 = 0, leftout = 0, leftin = 0, rightin = 0, rightout = 0;
        boolean isLeft = true, end = false;
        for (int i = 0; i < s.length(); i++) {
            if (isLeft) {
                if (harfleft.length() > 0 && harfleft.charAt(h) == s.charAt(i)) {
                    h++;
                    if (h == harfleft.length()) {
                        isLeft = false;
                    }
                } else {
                    if (h == 0) {
                        leftout++;
                    } else {
                        leftin++;
                    }
                }
            } else {
                if (!end) {
                    if (harfright.length() > 0 &&  harfright.charAt(h2) == s.charAt(i)) {
                        h2++;
                        if(h2 == harfright.length()) {
                            end = true;
                        }
                    }else {
                        rightin++;
                    }
                }else {
                    rightout++;
                }
            }
        }
        System.out.println(Math.abs(leftout - rightout) + Math.abs(leftin - rightin));
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().solve();
    }
}