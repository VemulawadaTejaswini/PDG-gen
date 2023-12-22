import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        int res = (int)Math.ceil((double)n / (d * 2 + 1));
        System.out.println(res);
    }
}
