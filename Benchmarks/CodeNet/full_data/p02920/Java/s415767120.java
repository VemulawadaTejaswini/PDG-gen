
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static class Slime implements Comparable<Slime> {
        int health;
        int steps;

        public Slime(int health, int steps) {
            this.health = health;
            this.steps = steps;
        }

        @Override
        public int compareTo(Slime other) {
            int c = other.health - this.health;
            if (c == 0) c = other.steps - this.steps;
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] S = new int[(1 << N)];
        for (int i = 0; i < S.length; i++) S[i] = sc.nextInt();

        Arrays.sort(S);

        PriorityQueue<Slime> slimes = new PriorityQueue<>();
        slimes.add(new Slime(S[S.length - 1], N));
        int next = S.length - 2;

        while (!slimes.isEmpty()) {
            Slime slime = slimes.poll();

            if (slime.steps == 0) continue;

            if (S[next] >= slime.health) {
                System.out.println("No");
                return;
            }

            for (int steps = slime.steps - 1; steps >= 0; steps--) {
                slimes.add(new Slime(S[next], steps));
                next--;
            }
        }

        System.out.println("Yes");
    }
}
