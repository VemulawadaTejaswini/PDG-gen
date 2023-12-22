import java.awt.*;
import java.util.*;
import java.util.List;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Point> redPoints = new ArrayList<>();
        List<Point> bluePoints = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            redPoints.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        for (int i = 0; i < N; i++) {
            bluePoints.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        redPoints.sort(new PointSort());
        bluePoints.sort(new PointSort());

        int cnt = 0;
        boolean[] used = new boolean[redPoints.size()];
        for (Point bp : bluePoints) {

            Point rp = null;
            int irp = -1;

            for (int i = 0; i < redPoints.size(); i++){
                Point tmprp = redPoints.get(i);
                if (tmprp.x >= bp.x) {
                    break;
                }

                if(used[i] == true){
                    continue;
                }

                // 出来るだけ大きいYのポイントを取る
                if (rp == null || (rp.y < tmprp.y && tmprp.y < bp.y)) {
                    rp = tmprp;
                    irp = i;
                }
            }

            if (rp != null) {
                used[irp] = true;
                cnt++;
            }
        }

        out.println(cnt);
    }

    public static class PointSort implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            return Integer.compare(o1.x, o2.x);
        }
    }
}