import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean rslt = false;
        for (int i = 1; i <= 9; i++) {
            if (0 < n%i) continue;
            if (9 < n/i || n/i < 0) continue;
            rslt = true;
            break;
        }
        System.out.println(rslt?"Yes":"No");
    }
}