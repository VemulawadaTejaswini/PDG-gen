import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        if (max == Integer.MIN_VALUE || min == Integer.MAX_VALUE) {
            System.out.println(0);
        }
        System.out.println(max - min);
    }
}