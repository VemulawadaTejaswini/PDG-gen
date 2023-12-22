import java.util.Scanner;

public class Main {
    public Main () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] list = new char[n];
        long ans;
        int m, a, r, c, h;
        m = 0; a = 0; r = 0; c = 0; h = 0;

        for (int i = 0; i < n; i++) {
            list[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < n; i++) {
            char s = list[i];
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

        ans = m*a*r + m*a*c + m*a*h + m*r*c + m*r*h
                + m*c*h + a*r*c + a*r*h + a*c*h + r*c*h;

        System.out.println(ans);
    }

    public static void main (String[] args) {
        new Main();
    }

}
