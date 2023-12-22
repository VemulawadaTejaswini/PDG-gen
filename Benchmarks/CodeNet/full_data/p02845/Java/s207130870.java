import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        Map<State, Long> before = new HashMap<>();
        before.put(new State(0, 0, 0), 1L);
        for(int k=0; k<N; k++) {
            Map<State, Long> after = new HashMap<>();
            for(State state : before.keySet()) {
                if(state.blue == A[k]) {
                    State nextState = new State(state.blue+1, state.red, state.green);
                    Long tmp = 0L;
                    if(after.containsKey(nextState)) {
                        tmp = after.get(nextState);
                    }
                    after.put(nextState, (tmp + before.get(state)) % 1000000007);
                }
                if(state.red == A[k]) {
                    State nextState = new State(state.blue, state.red+1, state.green);
                    Long tmp = 0L;
                    if(after.containsKey(nextState)) {
                        tmp = after.get(nextState);
                    }
                    after.put(nextState, (tmp + before.get(state)) % 1000000007);
                }
                if(state.green == A[k]) {
                    State nextState = new State(state.blue, state.red, state.green+1);
                    Long tmp = 0L;
                    if(after.containsKey(nextState)) {
                        tmp = after.get(nextState);
                    }
                    after.put(nextState, (tmp + before.get(state)) % 1000000007);
                }
            }
            before = after;
        }
        // calc result
        long result = 0L;
        for(State s : before.keySet()) {
            Long tmp = before.get(s);
            result = (result + tmp) % 1000000007;
        }
        System.out.println(String.format("%d", result));
    }

    static class State {
        int blue, red, green;
        State(int blue, int red, int green) {
            this.blue = blue;
            this.red = red;
            this.green = green;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            State state = (State) o;
            return blue == state.blue &&
                    red == state.red &&
                    green == state.green;
        }

        @Override
        public int hashCode() {

            return Objects.hash(blue, red, green);
        }
    }
}
