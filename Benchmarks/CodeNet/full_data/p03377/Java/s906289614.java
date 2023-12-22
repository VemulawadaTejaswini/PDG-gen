import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[] w = new int[100010];
    static int[] v = new int[100010];
    static int[][] dp = new int[110][100010];
    static int k;

    static int chmin(int a, int b) {
        if (a > b) {
            a = b;
            return a;
        }
        return a;
    }

    static int chmax(int a, int b) {
        if (a < b) {
            a = b;
            return a;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cat = sc.nextInt();
        int b=sc.nextInt();
        int x = sc.nextInt();
        if (cat > x) {
            System.out.println("NO");
            return;
        } else if (cat + b >= x) {
            System.out.println("YES");
            return;
        } else {
            System.out.println("NO");
        }

    }
}
