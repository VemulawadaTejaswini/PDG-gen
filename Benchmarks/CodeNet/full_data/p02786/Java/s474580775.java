import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long h = Long.parseLong(scanner.next());
        long x = 1;
        long atc = 0;
        for (int i = 0; true; i++) {
            h = h / 2;
            atc = atc + x;
            x = x * 2;
            if (h == 0) {
                System.out.println(atc);
                break;
            }

        }
    }
}