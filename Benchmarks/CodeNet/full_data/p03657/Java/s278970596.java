import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a + b < 3) {
            System.out.println("Impossible");
            System.exit(0);
        }

        System.out.println( ((a>3 && a%3 == 0) || (b>3 && b%3 == 0) || ((a+b)%3 == 0)) ? "Possible" : "Impossible" );
    }

}