import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = h * x;
        int b = w * y;
        boolean flag = a==b;
        System.out.println((double)Math.min(a,b) + " " + (flag ? 1 : 0));
    }
}