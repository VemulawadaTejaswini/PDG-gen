import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        if (min == 1) {
            System.out.println(1);
            return;
        }
        long cnt = 2;// 1と2
        for (int i = 3; i < min; i += 2) {
            if (min % i == 0) {
                if (max % i == 0) {
                    if (IsPrime(i)) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    static boolean IsPrime(int n) {
        double sqrtNum = Math.sqrt(n);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
