import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String next = sc.next();
        if (next.equals("A")) {
            System.out.println("T");
        } else if (next.equals("T")) {
            System.out.println("A");
        } else if (next.equals("C")) {
            System.out.println("G");
        } else if (next.equals("G")) {
            System.out.println("C");
        }
    }
}
