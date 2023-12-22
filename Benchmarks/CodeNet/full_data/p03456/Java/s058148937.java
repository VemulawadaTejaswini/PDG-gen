import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();

        int a = Integer.parseInt(x + y);

        if ((int) Math.sqrt(a) * (int) Math.sqrt(a) == a) System.out.println("YES");
        else System.out.println("NO");
    }

}
