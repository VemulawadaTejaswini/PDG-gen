import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int f = 0;
        int s = 0;

        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if (num == 5) {
                f++;
            } else if (num == 7) {
                s++;
            }
        }

        sc.close();

        boolean ans = false;
        if (f == 2 && s == 1) {
            ans = true;
        }

        System.out.println(ans ? "YES" : "NO");

    }
}