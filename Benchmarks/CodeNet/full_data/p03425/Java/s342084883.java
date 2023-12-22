import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public Main () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Character> list = new LinkedList<Character>();
        int m, a, r, c, h;
        long ans = 0;

        m = 0; a = 0; r = 0; c = 0; h = 0;

        for (int i = 0; i < n; i++) {
            list.add(i, sc.next().charAt(0));
        }

        for (int i = 0; i < n; i++) {
            if (!march(list.get(i))) {
                list.remove(i);
                n--;
            }
        }

        for (int i = 0; i < n; i++) {
            char s = list.get(i);
            switch (s) {
                case 'M':
                    m++;
                    break;
                case 'A':
                    a++;
                    break;
                case 'R':
                    r++;
                    break;
                case 'C':
                    c++;
                    break;
                case 'H':
                    h++;
            }
        }

        ans += m*a*r;
        ans += m*a*c;
        ans += m*a*h;
        ans += m*r*c;
        ans += m*r*h;
        ans += m*c*h;
        ans += a*r*c;
        ans += a*r*h;
        ans += a*c*h;
        ans += r*c*h;

        System.out.println(ans);
    }

    boolean march(char s) {
        return s == 'M' || s == 'A'|| s == 'R' || s == 'C' || s == 'H';
    }

    public static void main (String[] args) {
        new Main();
    }

}
