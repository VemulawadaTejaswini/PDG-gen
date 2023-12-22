
import java.util.*;

public class Main {

    static class Step {
        int t;
        int x;
        int y;

        public Step(int t, int x, int y) {
            this.t = t;
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Step> steps = new ArrayList<>();
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int t = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            steps.add(new Step(t, x, y));
        }

        boolean can = true;
        int xStart = 0, yStart = 0, tStart = 0;
        for (int i = 0; i < steps.size(); i++) {
            int t = steps.get(i).t - tStart;
            int dist = Math.abs(steps.get(i).x - xStart) + Math.abs(steps.get(i).y - yStart);
            if (t < dist) {
                can = false;
            } else {
                can = t % 2 == dist % 2;
            }
            if (!can) {
                break;
            }
            tStart = steps.get(i).t;
            xStart = steps.get(i).x;
            yStart = steps.get(i).y;
        }


        if (can) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
