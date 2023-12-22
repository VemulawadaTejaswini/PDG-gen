import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        String ans = solve(N, A);

        System.out.println(ans);
    }

    private static String solve(int N, int A) {
        N %= 500;

        return  N <= A ? "Yes" : "No";
    }

}
