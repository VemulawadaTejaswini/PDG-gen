import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);
        for (int i = 1; i <= 1101; i++) {
            if (i == 1101) {
                System.out.println("-1");
                return;
            }
            int taxa = (int) (i * 0.08);
            int taxb = (int) (i * 0.1);
            if (taxa == a && taxb == b) {
                System.out.println(i);
                return;
            }
        }
    }
}