import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a + b  > n + 1 || a * b < n || n > 1) {
            System.out.println(-1);
            return;
        }
        int c = 0;
        for (int i = 1; i <= a; i++) {
            int num =  Math.min(n - c - (a - i), b);
            for (int j = 0; j < num; j++) {
                System.out.print(c + num - j + " ");

            }
            c += num;
        }
    }
}
