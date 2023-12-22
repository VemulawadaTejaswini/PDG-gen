import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();
        String y = sc.nextLine();
        if (x.compareTo(y) > 0)
            System.out.println(">");
        else if (x.compareTo(y) == 0)
            System.out.println("=");
        else
            System.out.println("<");
    }
}