import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int dn[] = new int[n];
        for (int i = 0; i < n; i++) {
            dn[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dn[i] > dn[j]) {
                    int tmp = dn[i];
                    dn[i] = dn[j];
                    dn[j] = tmp;
                }
            }
        }
        int x = 1;
        for (int i = 0; i < n - 1; i++) {
            if (dn[i] < dn[i + 1]) {
                x++;
            }
        }

        System.out.println(x);
        scanner.close();
    }
}
