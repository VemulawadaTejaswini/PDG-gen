import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        String ans = solve(R);

        System.out.println(ans);
    }

    private static String solve(int R) {
        if (R < 1200) {
            return "ABC";
        } else if (R < 2800) {
            return "ARC";
        }

        return "AGC";
    }
}
