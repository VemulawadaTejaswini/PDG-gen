import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int D = sc.nextInt();
        int x_2000 = sc.nextInt();

        for (int i = 2001; i <= 2010; i++) {
            System.out.println(amount(r, i, D, x_2000));
        }

        sc.close();

    }

    public static int amount(int r, int i, int D, int x_2000) {
        if (i == 2000) {
            return x_2000;
        }
        return r * amount(r, i - 1, D, x_2000) - D;
    }
}