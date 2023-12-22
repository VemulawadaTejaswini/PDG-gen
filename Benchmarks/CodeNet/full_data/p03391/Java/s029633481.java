import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * Created by darshan on 5/26/19.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long totalAGreaterThanBDiff = 0;
        PriorityQueue<ALessThanBPair> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == b) {
                continue;
            }

            if (a > b) {
                totalAGreaterThanBDiff += (a - b);
            } else {
                priorityQueue.add(new ALessThanBPair(a, b));
            }
        }

        long aTurns = 0;
        long bTurns = 0;
        while (!priorityQueue.isEmpty()) {
            ALessThanBPair ALessThanBPair = priorityQueue.poll();
            if (ALessThanBPair.a == 0) {
                bTurns += ALessThanBPair.b;
                continue;
            }

            if (aTurns <= bTurns) {
                aTurns += ALessThanBPair.a;
                priorityQueue.add(new ALessThanBPair(0, ALessThanBPair.b));
            } else {
                bTurns += (ALessThanBPair.b - ALessThanBPair.a);
            }
        }
        aTurns += totalAGreaterThanBDiff;
        if (aTurns != bTurns) {
            throw new IllegalStateException("Unequal number of turns");
        }
        System.out.println(aTurns);
    }

    private static class ALessThanBPair implements Comparable<ALessThanBPair> {
        private int a;
        private int b;

        ALessThanBPair(int a, int b) {
            if (a >= b) {
                throw new RuntimeException("a must always be lesser than b");
            }
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(ALessThanBPair other) {
            int thisDiff = this.b - this.a;
            int otherDiff = other.b - other.a;
            if (thisDiff == otherDiff) {
                return other.a - this.a;
            }
            return thisDiff - otherDiff;
        }
    }
}
