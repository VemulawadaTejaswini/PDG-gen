import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= i;
        }
        ans = ans % (Math.pow(10, 9) + 7);
        System.out.println((int) Math.ceil(ans));
    }
}