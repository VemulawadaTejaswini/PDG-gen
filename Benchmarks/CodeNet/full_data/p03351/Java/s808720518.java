import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        String result = "No";

        int ca = c - a;
        int ba = b - a;
        int cb = c - b;

        if (ca < 0 || ba < 0 || cb < 0) {
            
        } else if (ca <= d || (ba <= d && cb <= d)) {
            result = "Yes";
        }


        System.out.println(result);

    }
}