import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(), n = sc.nextInt();
        long res = n * (long) Math.pow(100, d);
        System.out.println(res);
    }
}