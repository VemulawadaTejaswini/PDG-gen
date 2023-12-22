import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = x; i < x + 100000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    static boolean isPrime(int num) {
        if(num == 2)     return true;               // 2だったら素数
        if(num % 2 == 0) return false;              // 偶数だったら合成数

        for(int i = 3; i <= Math.sqrt(num); i+=2) {
            if(num % i == 0) return false;          // 割り切れたら合成数
        }

        return true;                                // 割り切れなかったら素数
    }
}
