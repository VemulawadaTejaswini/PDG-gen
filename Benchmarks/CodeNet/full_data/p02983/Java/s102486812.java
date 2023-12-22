
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            for (int j = l; j <= r; j++) {
                if(i!=j && i < j && (i*j%2019) < min) min = i*j%2019;
            }
        }
        System.out.println("min = " + min);

        scanner.close();
    }
}
