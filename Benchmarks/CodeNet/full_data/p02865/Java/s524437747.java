import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int result = n / 2;
        if (n % 2 == 0) {
            result--;
        }

        System.out.println(result);
    }
}