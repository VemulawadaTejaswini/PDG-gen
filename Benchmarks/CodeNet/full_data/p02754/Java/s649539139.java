import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = Integer.parseInt(s.next());
        long A = Integer.parseInt(s.next());
        long B = Integer.parseInt(s.next());
        if (A == 0) {
            System.out.println(0);
            return;
        }
        long L = A + B;
        long count = N / L;
        long mo = N % L;
        mo = mo <= A ? mo : A;
        System.out.println(count * A + mo);
    }
}