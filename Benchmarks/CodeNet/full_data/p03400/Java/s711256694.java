import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int d = cin.nextInt();
        int x = cin.nextInt();
        int a = 0;
        for (int i = 0; i < n; i++) {
            a = cin.nextInt();
            for (int day = 1; day <= d; day += a) {
                x++;
            }
        }
        System.out.println(x);
    }

}
