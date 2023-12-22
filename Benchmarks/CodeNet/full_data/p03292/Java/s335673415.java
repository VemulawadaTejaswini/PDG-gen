import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        int ca = Math.abs(c - a);
        int min = Mth.min(a, b);
        min = Math.min(min, c);
        int max = Mth.max(a, b);
        max = Math.max(max, c);

        if (min == a && max == b) {
            System.out.println(ca +bc);
        } else if (min == b && max == c) {
            System.out.println(ab + ca);
        } else if (min == c && max == a) {
            System.out.println(bc + ab);
        }
    }
}