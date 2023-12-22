import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        int result = b;
        if (a <= 5) {
            result = 0;
        } else if (a <= 12) {
            result = b /2;
        }

        System.out.println(result);
    }
}