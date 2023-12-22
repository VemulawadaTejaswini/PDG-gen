import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cnt = x / 100;
        int n = x % 100;
        cnt -= n / 5;
        n %= 5;
        cnt -= n / 4;
        n %= 4;
        cnt -= n / 3;
        n %= 3;
        cnt -= n / 2;
        n %= 2;
        if (cnt - n >= 0) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }

}
