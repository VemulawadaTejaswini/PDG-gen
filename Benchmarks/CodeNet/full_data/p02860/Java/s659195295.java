import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            in.nextLine();
            String s = in.nextLine();
            if (n % 2 == 1) {
                System.out.println("No");
            } else {
                n /= 2;
                System.out.println((s.substring(0, n).endsWith(s.substring(n))) ? "Yes" : "No");
            }
        }
    }
}