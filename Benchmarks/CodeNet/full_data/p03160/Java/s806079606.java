import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static class Move {
        private int pos;
        private int cost;

        Move(int pos, int cost)
        {
            this.pos = pos;
            this.cost = cost;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = scanner.nextInt();
        }

        List<Move> moves = new LinkedList<>();
        moves.add(new Move(0, 0));
        int best = Integer.MAX_VALUE;
        while (!moves.isEmpty()) {
            Move move = moves.remove(0);
            if (move.pos == n - 1) {
                if (move.cost < best) {
                    best = move.cost;
                }
            }
            else {
                if (move.pos + 1 < n) {
                    moves.add(new Move(move.pos + 1, move.cost + Math.abs(xs[move.pos + 1] - xs[move.pos])));
                }
                if (move.pos + 2 < n) {
                    moves.add(new Move(move.pos + 2, move.cost + Math.abs(xs[move.pos + 2] - xs[move.pos])));
                }
            }
        }
        System.out.println(best);
    }
}

