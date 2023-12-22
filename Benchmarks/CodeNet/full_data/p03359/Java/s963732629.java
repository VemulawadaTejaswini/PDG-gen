import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        System.out.println(solve(a, b));
    }

    static int solve(int a, int b) {

        if (a == 1) {
            return 1;
        }

        return a > b ? a - 1 : a;
    }

}