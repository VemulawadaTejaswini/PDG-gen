import jdk.nashorn.internal.parser.Scanner;

/**
 * c
 */
public class c {

    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextLine().split(" ");

        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.index(i + 1) + 1);
            System.out.print(" ");
        }
        System.out.println();
    }
}