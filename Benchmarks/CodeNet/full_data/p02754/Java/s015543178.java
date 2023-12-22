import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        sc.close();
        //青いボールの合計個数
        long sumA = N / (A + B) * A;
        long remain = N % (A + B);

        if (remain < A) {
            sumA += remain;
        } else {
            sumA += A;
        }
        System.out.println(sumA);
    }

}