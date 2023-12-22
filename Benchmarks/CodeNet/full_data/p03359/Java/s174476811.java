import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = 0;
        if (a <= b) {
            p++;
        }
        System.out.println(a - 1 + p);
        sc.close();
    }
}