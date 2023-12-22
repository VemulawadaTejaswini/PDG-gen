import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int digit_100 = N / 100;
        int digit_10 = (N / 10) % 10;
        int digit_1 = N % 10;

        int ans = 0;
        if (digit_100 >= digit_10 && digit_100 >= digit_1) {
            ans = 111*digit_100;
        } else  {
            ans = 111*(digit_100+1);
        }

        System.out.println(ans);

    }
}