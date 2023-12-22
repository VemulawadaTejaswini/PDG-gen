import java.util.Scanner;

public class Main {
    static int sx;
    static int sy;
    static int tx;
    static int ty;
    static long mod = 1000000007L;
    static long[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sx = sc.nextInt();
        sy = sc.nextInt();
        tx = sc.nextInt();
        ty = sc.nextInt();

        int distanceX = tx - sx;
        int distanceY = ty - sy;

        //1週目
        proc("R", distanceX);
        proc("U", distanceY);
        proc("L", distanceX);
        proc("D", distanceY);

        //2週目
        proc("D", 1);
        proc("R", distanceX+1);
        proc("U", distanceY+1);
        proc("L", 1);

        proc("U", 1);
        proc("L", distanceX+1);
        proc("D", distanceY+1);
        proc("R", 1);

        System.out.println();
    }
    static void proc(String direction, int distance) {
        for (int i = 0; i < distance; i++) {
            System.out.print(direction);
        }
    }
}
