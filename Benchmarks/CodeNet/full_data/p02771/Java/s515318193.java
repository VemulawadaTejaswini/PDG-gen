import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC155A - Poor

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String ans = "No";
        if ((a == b && a == c) ||
            (a != b && a != c && b != c)) {

        } else {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}