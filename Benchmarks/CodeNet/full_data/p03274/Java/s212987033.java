import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int[] xs = new int[N];
            List<Integer> leftq = new ArrayList<>();
            List<Integer> rightq = new ArrayList<>();
            int tolight = K;
            for (int i = 0; i < N; i++) {
                xs[i] = scanner.nextInt();
                if (xs[i] < 0) {
                    leftq.add(xs[i]);
                } else if (xs[i] > 0) {
                    rightq.add(xs[i]);
                } else {
                    tolight--;
                }
            }
            if (tolight == 0) {
                System.out.println(0);
                return;
            }
            int min = Integer.MAX_VALUE;
            { //left
                if (leftq.size() - tolight >= 0) {
                    int kpos = leftq.get(leftq.size() - tolight);
                    min = Math.min(min, Math.abs(kpos));
                }
            }
            {
                if (tolight - 1 < rightq.size()) {
                    int kpos = rightq.get(tolight - 1);
                    min = Math.min(min, Math.abs(kpos));
                }
            }
            int leftPos = leftq.size() - 1;
            int rightPos = Math.min(tolight - 1 - 1, rightq.size() - 1);
            for (int i = 0; i < tolight - 1; i++) {
                if (leftPos - i < 0 || rightPos - i < 0) {
                    break;
                }
                int leftDist = Math.abs(leftq.get(leftPos - i));
                int rightDist = rightq.get(rightPos - i);
                int dist = Math.min(
                        2 * leftDist + rightDist,
                        leftDist + 2 * rightDist
                );
                min = Math.min(dist, min);
            }
            System.out.println(min);
        }
    }
}
