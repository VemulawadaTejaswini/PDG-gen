import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int a = (2 * Y - X) / 3;
        int b = (2 * X - Y) / 3;
        if((2 * Y - X) % 3 != 0 || (2 * X - Y) % 3 != 0) {
            System.out.println(0);
            return;
        }
        int c = combination(a+b, a);
        System.out.println(c);
    }
    public static int combination(int n, int r)
    {
        if (r == 0 || r == n)
            return (1);
        else if (r == 1)
            return (n);
        return (combination(n - 1, r - 1) + combination(n - 1, r));
    }

}
