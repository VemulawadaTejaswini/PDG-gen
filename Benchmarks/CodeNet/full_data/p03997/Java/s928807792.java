import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(a)
        int a = sc.nextInt();
        // 入力(b)
        int b = sc.nextInt();
        // 入力(h)
        int h = sc.nextInt();

        System.out.println((a + b) * h / 2);
        sc.close();
    }
}