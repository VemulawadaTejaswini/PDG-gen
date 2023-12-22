import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= x * x + 1; i++) {
            if (i * i > x) {
                System.out.println((i - 1) * (i - 1));
                return;
            }
        }
    }
}
