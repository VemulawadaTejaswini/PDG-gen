import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n < m / 2) {
            System.out.println(n + (m - 2 * n) / 4);
        } else {
            System.out.println(m / 2);
        }
    }
}