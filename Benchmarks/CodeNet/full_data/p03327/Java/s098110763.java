
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String ans = solve(N);

        System.out.println(ans);
    }

    private static String solve(int N) {
        String abc = N < 1000 ? "ABC" : "ABD";

        return abc;
    }
}
