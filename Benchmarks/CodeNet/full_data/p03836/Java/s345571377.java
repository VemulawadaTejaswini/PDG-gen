import java.util.*;

public class Main{
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
        int[] s1 = { sx, sy - 1 };
        int[] t1 = { tx + 1, ty };
        System.out.print("D");
        move(s1, t1);
        System.out.print("L");
        int[] t2 = { tx, ty + 1 };
        int[] s2 = { sx - 1, sx };
        System.out.print("U");
        move(t2, s2);
        System.out.println("R");
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
            return;
        } else {
            for (int j = s; j >= t; j--) {
                System.out.print("L");
            }
        }
    }

    static void moveY(int s, int t) {
        if (s < t) {
            for (int i = 0; i < t - s; i++) {
                System.out.print("U");
            }
            return;
        } else {
            for (int j = s; j >= t; j--) {
                System.out.print("D");
            }
        }
    }
}