import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int h_s = sc.nextInt();
        int w_s = sc.nextInt();

        int count = h * w;
        count -= (h_s * w) + (w_s * h) - (h_s * w_s);
        System.out.println((h_s * w) + (h_s * w) - (h_s * w_s));
        System.out.println(count);
    }
}
