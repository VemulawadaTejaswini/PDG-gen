import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int p = k / 500 * 1000;
        int q = (k % 500) / 5 * 5;
        System.out.println(p + q);
    }
}
