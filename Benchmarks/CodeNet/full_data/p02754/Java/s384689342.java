import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        if (N == 0 || A == 0) {
            System.out.print(0);
        }

        long diff = 0;
        if (N > (A + B)) {
            diff += N - (A + B);
        }

        System.out.println(A + diff);
    }
}
