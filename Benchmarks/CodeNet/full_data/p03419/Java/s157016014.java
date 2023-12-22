import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int x = Math.min(n, m);
        int y = Math.max(n, m);

        long ans = 0;

        if (x == 1 && y == 1) {
            ans = 1;
        } else if (x == 1 && y > 1) {
            ans = y-2;
        } else {
            ans = (x-2) * (y-2);
        }

        System.out.println(ans);
    }
}
