import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] red = new Pair[n];
        Pair[] blue = new Pair[n];
        for(int i = 0; i < n; i++) {
            red[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        for(int i = 0; i < n; i++) {
            blue[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(red, (pt1, pt2) -> (pt2.y - pt1.y));
        Arrays.sort(blue, (pt1, pt2) -> (pt1.x - pt2.x));

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (red[j] == null)
                    continue;
                if (red[j].x < blue[i].x && red[j].y < blue[i].y) {
                    red[j] = null;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}