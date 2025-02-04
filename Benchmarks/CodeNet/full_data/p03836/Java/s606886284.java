import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int sx = kbd.nextInt();
        int sy = kbd.nextInt();
        int tx = kbd.nextInt();
        int ty = kbd.nextInt();
        int[] s = { sx, sy };
        int[] t = { tx, ty };

        // いちどめ
        move(s, t);
        move(t, s);

        // にどめ
        int[] s1 = { sx - 1, sy };
        int[] t1 = { tx, ty + 1 };
        move(s, s1);
        move(s1, t1);
        move(t1, t);
        int[] s2 = { sx, sy - 1 };
        int[] t2 = { tx + 1, ty };
        move(t, t2);
        move(t2, x2);
        move(x2, x);
        System.out.println();
    }

    static void move(int[] s, int[] t) {
        moveX(s[0], t[0]);
        moveY(s[1], t[1]);
    }

    static void moveX(int s, int t) {
        if (s < t) {
            for (int i = 0; i < t - s; i++) {
                System.out.print("R");
            }
        } else if (s == t) {
            return;
        } else {
            for (int j = s; j > t; j--) {
                System.out.print("L");
            }
        }
        return;
    }

    static void moveY(int s, int t) {
        if (s < t) {
            for (int i = 0; i < t - s; i++) {
                System.out.print("U");
            }
        } else if (s == t) {
            return;
        } else {
            for (int j = s; j > t; j--) {
                System.out.print("D");
            }
        }
        return;
    }
}