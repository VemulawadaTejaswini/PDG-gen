import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long res = 0;
        for (int b = 1 ; b <= N ; b++) {
            int p = N / b ;
            int r = N % b;
            res += p * Math.max(0,  b - K) + Math.max(0,  r - K + 1);
        }
        System.out.println(res);
    }

}