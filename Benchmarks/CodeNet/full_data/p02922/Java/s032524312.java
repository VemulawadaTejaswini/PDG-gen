import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int ans;
        if (a == 2) ans = b - 1;
        else {
            if (b % (a - 1) < 2) ans = b / (a - 1);
            else ans = (b / (a - 1)) + 1;
        }
        System.out.println(ans);
    }
}