import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a >= 13) {
            System.out.println(b);
        } else if (a >= 6 && a <= 12) {
            System.out.println(b/2);
        } else {
            System.out.println(0);
        }
    }

}
