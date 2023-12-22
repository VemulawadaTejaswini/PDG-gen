import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "1 21";
        Scanner sc = new Scanner(input);
        // Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        double sqrt = Math.sqrt(Double.parseDouble(a + b));

        System.out.println(sqrt == (double)(long)(sqrt) ? "Yes" : "No");
    }
}
