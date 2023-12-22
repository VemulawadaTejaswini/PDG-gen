import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double total = 0.0;

        for (int i = 0; i < N; i++) {
            String tmp = sc.next();
            if (sc.next().equals("JPY")) {
                total += Double.parseDouble(tmp);
            } else {
                total += 380000.0 * Double.parseDouble(tmp);
            }
        }

        System.out.println(total);
    }
}
