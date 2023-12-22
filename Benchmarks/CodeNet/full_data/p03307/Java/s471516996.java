import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(n * 2);
        }
    }
}