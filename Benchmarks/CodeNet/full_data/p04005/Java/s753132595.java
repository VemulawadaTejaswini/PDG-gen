import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b  && a > c)  {
            calc(a,b,c);
        } else if (b > a && b > c) {
            calc(b, a, c);
        } else {
            calc(c, a, b);
        }
    }

    private static void calc(int a, int b, int c) {
        int half = a / 2;
        if (a % 2 == 1) half++;
        long big = (long)half *b *c;
        long small = (long)(a-half) *b *c;
        System.out.println(big-small);
    }
}
