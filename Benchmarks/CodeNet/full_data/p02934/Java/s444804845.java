import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1 / (double) std.nextInt();
        }

        System.out.println(Math.pow(sum, -1));
    }
}