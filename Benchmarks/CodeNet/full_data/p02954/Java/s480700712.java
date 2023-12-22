import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] lr = s.toCharArray();
        int[] children = new int[s.length()];

        int border = 0;
        char now = 'R';
        for (int i = 0; i < s.length(); i++) {
            if (lr[i] == now) {
                continue;
            }
            if (lr[i] != now) {
                int r = i - border;
                if (now == 'R') {
                    children[i - 1] += r / 2 + r % 2;
                    children[i] += r / 2;
                }
                if (now == 'L') {
                    children[border - 1] += r / 2;
                    children[border] += r / 2 + r % 2;
                }
                border = i;
                now = lr[i];
            }
            for (int j = 0; j < children.length; j++) {
                System.out.print(children[j] + " ");
            }
            System.out.println("");
        }
        int l = s.length() - border;
        children[border - 1] += l / 2;
        children[border] += l / 2 + l % 2;
        for (int i = 0; i < children.length; i++) {
            System.out.print(children[i] + " ");
        }
    }
}