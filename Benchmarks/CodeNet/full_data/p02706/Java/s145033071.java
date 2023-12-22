import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            int x = scan.nextInt();
            d-=x;
        }
        System.out.println(d < 0 ? -1 : d);
    }
}
