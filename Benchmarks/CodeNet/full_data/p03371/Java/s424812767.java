import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i <= x ; i++) {
            min = Math.min(min, a * i + c * 2 * (x - i) + b * (Math.max(0, y - (x - i))));
        }
        for (int i = 0 ; i <= y ; i++) {
            min = Math.min(min, b * i + c * 2 * (y - i) + a * (Math.max(0, x - (y - i))));
        }
        System.out.println(min);
    }

}