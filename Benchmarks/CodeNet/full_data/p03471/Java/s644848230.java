import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int Z = Y/1000 - N;
        int a;
        int b = 0;
        int c;
        while(true) {
            int x = Z - 4*b;

            if (b >= 2000 || x < 0) {
                a = -1;
                b = -1;
                c = -1;
                break;
            }

            if(x % 9 == 0) {
                a = x / 9;
                c = N - a - b;
                if (c >= 0) {
                    break;
                }
            }
            b += 1;
        }
        System.out.print(a);
        System.out.print(' ');
        System.out.print(b);
        System.out.print(' ');
        System.out.print(c);
    }
}