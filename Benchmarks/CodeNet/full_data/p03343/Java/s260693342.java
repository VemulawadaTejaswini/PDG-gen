import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * Created by darshan on 5/30/19.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[] num = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int minDiff = Integer.MAX_VALUE;
        PriorityQueue<Integer> leastKElements = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < n; i++) {
            int low = num[i];
            leastKElements.clear();
            leastKElements.add(low);
            int sequenceSize = 1;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }

                if (num[j] >= low) {
                    sequenceSize++;
                    if (leastKElements.size() == q) {
                        int currentHigh = leastKElements.peek();
                        if (currentHigh > num[j]) {
                            leastKElements.poll();
                            leastKElements.add(num[j]);
                        }
                    } else {
                        leastKElements.add(num[j]);
                    }
                    if (sequenceSize - k + 1 >= q) {
                        minDiff = Math.min(minDiff, leastKElements.peek() - low);
                    }
                } else {
                    leastKElements.clear();
                    leastKElements.add(low);
                    sequenceSize = 1;
                }
            }
        }
        System.out.println(minDiff);
    }
}
