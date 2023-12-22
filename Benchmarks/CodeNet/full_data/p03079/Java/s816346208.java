import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean ans = false;

        //        for (int i = 0; i < n; i++) {
        //
        //        }

        if (a == b && b == c)
            ans = true;

        sc.close();

        System.out.println(ans ? "Yes" : "No");

    }
}