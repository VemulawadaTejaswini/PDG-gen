import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        int wa = 0;
        int work = n;

        while (work != 0) {
            wa += work % 10;
            work /= 10;
        }

        if (n % wa == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
