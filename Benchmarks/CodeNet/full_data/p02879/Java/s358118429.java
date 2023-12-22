import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        int result = -1;
        if (a >= 1 && a <= 9 && b >= 1 && b <= 9) {
            result = a * b;
        }

        System.out.println(result);
    }
}