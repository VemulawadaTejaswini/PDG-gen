
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
        for (int i = 1; i < steps.size(); i++) {
            int t = steps.get(i).t - steps.get(i-1).t;
            int dist = Math.abs(steps.get(i).x - steps.get(i-1).x) + Math.abs(steps.get(i).y - steps.get(i-1).y);
            if (t < dist) {
                can = false;
            } else {
                can = t % 2 == dist % 2;
            }
            if (!can) {
                break;
            }
        }


        if (can) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
