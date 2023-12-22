import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int prevX = 0;
        int prevY = 0;
        int prevT = 0;
        Thing[] arr = new Thing[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Thing(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
        Arrays.sort(arr);

        Thing prev = new Thing(0, 0, 0);
        for (int i = 0; i < n; i++) {
            Thing cur = arr[i];
            int diff = Math.abs(cur.x - prev.x) + Math.abs(cur.y - prev.y);
            int tDiff = cur.t - prev.t;
            if (tDiff % 2 != diff %2 || diff > tDiff) {
                System.out.println("No");
                return;
            }
            prev = cur;
        }
        System.out.println("Yes");
    }
}

class Thing implements Comparable<Thing> {
    int t, x, y;

    public Thing(int t, int x, int y) {
        this.t = t;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Thing o) {
        return t - o.t;
    }
}