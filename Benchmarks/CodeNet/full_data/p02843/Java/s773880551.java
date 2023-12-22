import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 2000) {
            System.out.println(1);
        }
        int c = x / 100;
        if (x % 100 > c * 5) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

}