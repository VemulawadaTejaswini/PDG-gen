import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                int a = scan.next();
                int b = scan.next();

                if ((a * b ) % 2 == 0 ) {
                    System.out.printf("Even");
                } else {
                    System.out.printf("Odd");
                }
            }
}
