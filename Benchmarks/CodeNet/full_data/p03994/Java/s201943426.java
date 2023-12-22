
import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());
        int move = sc.nextInt();
        int length = sb.length();

        while (move != 0) {
            for (int i = 0; i < length; i++) {
                int num = sb.charAt(i) - 'a';

                if (26 - num <= move) {
                    sb.setCharAt(i, 'a');
                    move -= 26 - num;
                }
                if (move == 0) break;
            }

            if (move == 0) break;

            move = move % 26;

            int num = sb.charAt(length - 1) - 'a';
            char next = (char) (num + move + 'a');
            sb.setCharAt(length - 1, next);
            break;
        }

        System.out.println(sb);
    }
}