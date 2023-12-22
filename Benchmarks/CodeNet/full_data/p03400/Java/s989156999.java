import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), d = in.nextInt(), x = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            sum += (d - 1) / a + 1;
        }
        System.out.println(x + sum);
    }
}