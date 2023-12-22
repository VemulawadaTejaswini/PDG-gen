import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int x = 0, y = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            String[] strings = sc.nextLine().split(" ");
            int nt = Integer.parseInt(strings[0]);
            int nx = Integer.parseInt(strings[1]);
            int ny = Integer.parseInt(strings[2]);
            if (!helper(t, x, y, nt, nx, ny)) {
                System.out.println("No");
                return;
            }
            t = nt;
            x = nx;
            y = ny;
        }
        System.out.println("Yes");
    }

    private static boolean helper(int t, int x, int y, int nt, int nx, int ny) {
        int dt = nt - t;
        int dx = Math.abs(nx - x);
        int dy = Math.abs(ny - y);
        if (dx + dy > dt) {
            return false;
        }
        return (dt & 1) == ((dx + dy) & 1);
    }
}