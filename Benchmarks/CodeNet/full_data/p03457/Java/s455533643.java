
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<CheckPoint> checkPoints= new ArrayList<>();
        for (int i=0; i<N; i++) {
            checkPoints.add(new CheckPoint(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }

        System.out.println(canDo(checkPoints) ? "Yes" : "No");
    }

    private static boolean canDo(List<CheckPoint> checkPoints) {
        CheckPoint from = new CheckPoint(0, 0, 0);
        CheckPoint to;
        for (int i=0; i < checkPoints.size(); i++) {
            to = checkPoints.get(i);
            int differenceTime = to.time - from.time;
            int distance = to.x - from.x + to.y - from.y;

            if (distance > differenceTime) {
                return false;
            }

            if (differenceTime % 2 == 0) {
                // 時間差が偶数
                if (distance % 2 != 0) {
                    return false;
                }
            } else {
                // 時間差が奇数
                if (distance % 2 == 0) {
                    return false;
                }
            }
            from = checkPoints.get(i);
        }
        return true;
    }

    static class CheckPoint {
        private int time;
        private int x;
        private int y;
        public CheckPoint(int time, int x, int y) {
            this.time = time;
            this.x = x;
            this.y = y;
        }
    }
}