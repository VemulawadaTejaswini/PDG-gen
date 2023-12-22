import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String b = sc.next();

        if ("A".equals(b)) System.out.println("T");
        if ("T".equals(b)) System.out.println("A");
        if ("C".equals(b)) System.out.println("G");
        if ("G".equals(b)) System.out.println("C");
    }
}
