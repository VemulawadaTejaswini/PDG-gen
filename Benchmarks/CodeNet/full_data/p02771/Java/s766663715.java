import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean isKawaisou = false;
        if (a == b && a != c) {
            isKawaisou = true;
        }
        if (a == c && a != c) {
            isKawaisou = true;
        }
        if (b == c && a != b) {
            isKawaisou = true;
        }

        if (isKawaisou) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}