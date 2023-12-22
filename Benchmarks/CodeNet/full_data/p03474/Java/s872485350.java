import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

        boolean isAns = s.matches(String.format("[0-9]{%d}-[0-9]{%d}", a, b));

        System.out.println(isAns ? "Yes" : "No");
    }
}
