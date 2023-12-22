import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private int digitSum(int v) {
        int sum = 0;
        while (v > 0) {
            sum += (v % 10);
            v /= 10;
        }
        return sum;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            int s = digitSum(i);
            if (s >= A && s <= B) {
                sum+=i;
            }
        }
        System.out.println(sum);

        return;
    }

}