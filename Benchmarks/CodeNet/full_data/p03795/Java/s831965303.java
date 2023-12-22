import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 800 * n;
        int w = n / 15 * 200;
        System.out.println(sum - w);
    }
}