import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int ab = a + b;
        int ac = a + c;
        int bc = b + c;

        int result = ab;

        if (ac <= result && ac <= bc) {
            result = ac;
        } else if (bc <= result && bc <= ac) {
            result = bc;
        }

        System.out.println(result);
    }
}