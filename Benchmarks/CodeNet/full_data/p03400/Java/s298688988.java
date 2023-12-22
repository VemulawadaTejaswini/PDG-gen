import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();

        int eaten = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            eaten += (d - 1) / a + 1;
        }

        System.out.println(x + eaten);
    }
}
