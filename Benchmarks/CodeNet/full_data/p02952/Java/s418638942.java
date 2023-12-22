import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int i = 10, res = 0, sign = 1;
        while (A >= i) {
            res += (i - 1) * sign;
            sign *= -1;
            i *= 10;
        }
        if (res <= 0) res += A;
        System.out.println(res);
    }
}