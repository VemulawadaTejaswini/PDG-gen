import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int xmax = -999;
        for (int i = 0; i < n; i++) {
            xmax = Math.max(xmax, sc.nextInt());
        }

        int ymin = 999;
        for (int i = 0; i < m; i++) {
            ymin = Math.min(ymin, sc.nextInt());
        }

        String ans = "War";
        for (int z = x + 1; z <= y; z++) {
            if (xmax < z && ymin >= z) {
                ans = "No War";
                break;
            }
        }

        System.out.println(ans);
    }

}

