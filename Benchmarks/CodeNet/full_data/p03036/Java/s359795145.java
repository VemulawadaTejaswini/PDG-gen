import java.util.Scanner;

public class Main {

    public static int aa = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x2000 = sc.nextInt();

        int xplus1 = x2000;

        for (int i = 0; i < 10; i++) {
            xplus1 = r * xplus1 - D;
            System.out.println(xplus1);
        }

    }
}