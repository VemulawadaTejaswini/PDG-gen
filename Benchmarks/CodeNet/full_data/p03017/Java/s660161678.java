import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        String s = sc.next();

        if (!validString(s, a, c) || !validString(s, b, d)) {
            System.out.println("No");
            return;
        }

        if (c > d) {
            if (check(s, a, b, c, d))
                System.out.println("Yes");
            else
                System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }

    private static boolean validString(String s, int min, int max) {
        for (int i=min-1; i < max-2; i++) {
            if (s.substring(i, i+2).equals("##"))
                return false;
        }
        return true;
    }

    private static boolean check(String s, int a, int b, int c, int d) {
        for (int i=b-2; i < d-3; i++) {
            if (s.substring(i, i+3).equals("..."))
                return true;
        }
        return false;
    }

}
