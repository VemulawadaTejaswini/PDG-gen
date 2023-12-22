
import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int move = sc.nextInt();
        int length = s.length();
        Pair[] p = new Pair[length];

        for (int i = 0; i < length; i++) {
            p[i] = new Pair(i, s.charAt(i) - 'a');
        }

        while (move != 0) {
            for (int i = 0; i < length; i++) {
                Pair getP = p[i];
                if (26 - getP.num <= move) {
                    s = s.substring(0, getP.index) + 'a' + s.substring(getP.index + 1);
                    move -= 26 - getP.num;
                    getP.num = 0;
                }
                if (move == 0) break;
            }

            if (move == 0) break;
            
            move = move % 26;

            Pair getP = p[length - 1];
            char next = (char) (getP.num + move + 'a');
            s = s.substring(0, getP.index) + next + s.substring(getP.index + 1);
            break;
        }

        System.out.println(s);
    }

    static class Pair {
        int index, num;

        Pair(int index, int num) {
            this.index = index;
            this.num = num;
        }
    }
}