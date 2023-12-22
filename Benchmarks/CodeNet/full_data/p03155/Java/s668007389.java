import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int h = std.nextInt();
        int w = std.nextInt();
        System.out.println((n - h + 1) * (n - w + 1));
    }
}