import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int i1 = i / 1000;
            int i2 = (i % 1000) / 100;
            int i3 = (i % 100) / 10;
            int i4 = i % 10;
            int add = i1 + i2 + i3 + i4;
            if (a <= add && add <= b) {
                count += i;
            }
        }
        System.out.println(count);
    }
}
