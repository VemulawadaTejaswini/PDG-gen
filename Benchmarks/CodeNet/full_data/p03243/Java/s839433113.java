import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n100;
        int n10;
        int n1;
        for (int i = n; i < 1000; i++) {
            n100 = i / 100;
            n10 = (i / 10) % 10;
            n1 = i % 10;
            if (n100 == n10 && n10 == n1) {
                System.out.println(i);
                break;
            }
        }

    }
}