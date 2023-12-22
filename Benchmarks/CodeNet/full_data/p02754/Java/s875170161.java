import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Integer.parseInt(sc.next());
        long A = Integer.parseInt(sc.next());
        long B = Integer.parseInt(sc.next());
        long result = ((N / (A + B)) * A) + Math.min(N % (A + B), A);

        System.out.println(result);
    }
}
