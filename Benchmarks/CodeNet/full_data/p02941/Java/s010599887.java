import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static class Position implements Comparable<Position>{
        int val, index, time;

        public Position(int val, int index, int time) {
            this.val = val;
            this.index = index;
            this.time = time;
        }

        @Override
        public int compareTo(Position position) {
            int c = position.val - this.val;
            if (c == 0) c = this.time - position.time;
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int i = 0; i < N; i++) B[i] = sc.nextInt();

        LinkedList<Integer> indices = new LinkedList<>();
        PriorityQueue<Position> positions = new PriorityQueue<>();
        int time = 0;

        for (int i = 0; i < N; i++) {
            int prev = i > 0 ? i - 1 : N - 1;
            int next = i < N - 1 ? i + 1 : 0;
            if (B[i] > A[i]) {
                positions.add(new Position(B[i], i, time));
                time++;
            }
        }

        int sol = 0;

        while (!positions.isEmpty()) {
            Position pos = positions.poll();
            if (B[pos.index] <= A[pos.index]) continue;
            int prev = pos.index > 0 ? pos.index - 1 : N - 1;
            int next = pos.index < N - 1 ? pos.index + 1 : 0;
            if (B[pos.index] <= B[prev] + B[next]) {
                sol = -1;
                break;
            }
            sol += B[pos.index] / (B[prev] + B[next]);
            B[pos.index] %= (B[prev] + B[next]);
            if (B[pos.index] > A[pos.index]) {
                pos.val = B[pos.index];
                pos.time = time;
                time++;
                positions.add(pos);
            }
        }

        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                sol = -1;
                break;
            }
        }

        System.out.println(sol);
    }
}
