import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int work = n;
        long sum = 0;

        while (work != 0) {
            sum += work % 10;
            work /= 10;
        }

        if (n % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}