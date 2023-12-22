import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int count = X;
        int value = X;
        int i;
        if (X == Y) {
            System.out.println(1);
            System.exit(0);
        }
        for (i = 1; i < 20; i++) {
            if (X*(i+1) >= Y) {
                break;
            }
        }
        System.out.println(i+1);
    }
}