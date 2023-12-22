import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int max = Math.max(a, Math.max(k, b));

        int work = max * 3;

        int tmp = work - (a + b + k);

        for (int i = tmp; i < work; i = i + 3) {
            if (i % 2 == 0) {
                System.out.println(i / 2);
                return;
            }
        }
    }
}