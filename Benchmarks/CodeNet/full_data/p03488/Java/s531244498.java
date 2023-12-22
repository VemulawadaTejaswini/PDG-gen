import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static final int[] X_OFFSETS = { 1, 0, -1, 0 };
    static final int[] Y_OFFSETS = { 0, -1, 0, 1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(solve(s, x, y) ? "Yes" : "No");

        sc.close();
    }

    static boolean solve(String s, int x, int y) {
        Set<State> states = Collections.singleton(new State(0, 0, 0));

        for (char command : s.toCharArray()) {
            Set<State> nextStates = new HashSet<>();
            for (State state : states) {
                if (command == 'F') {
                    nextStates.add(new State(state.x + X_OFFSETS[state.direction], state.y + Y_OFFSETS[state.direction],
                            state.direction));
                } else {
                    nextStates.add(new State(state.x, state.y, (state.direction + 1) % X_OFFSETS.length));
                    nextStates.add(
                            new State(state.x, state.y, (state.direction - 1 + X_OFFSETS.length) % X_OFFSETS.length));
                }
            }

            states = nextStates;
        }

        return states.stream().anyMatch(state -> state.x == x && state.y == y);
    }
}

class State {
    int x;
    int y;
    int direction;

    State(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }

    @Override
    public boolean equals(Object obj) {
        State other = (State) obj;

        return x == other.x && y == other.y && direction == other.direction;
    }
}