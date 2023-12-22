import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int summer = 0;
        while (sc.hasNext()) {
            summer+=sc.nextInt();
        }
        int ans = n-summer;
        if (ans<0) {
            ans = -1;
        }
        System.out.println(ans);

    }
}
