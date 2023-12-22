import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        float K = (A + B) / 2f;

        if (K == (int) K) {
            System.out.println((int) K);
        } else {
            System.out.println("IMPOSSIBLE");

        }
    }
}