import java.util.*;

class Main {
    class EatState {
        private int toEat;
        private int pati;

        public EatState(int eat, int pati) {
            this.toEat = eat;
            this.pati = pati;
        }

        public int toEat() {
            return this.toEat;
        }

        public int pati() {
            return this.pati;
        }
    }

    public static void main(String[] args) {
        new Main().main();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ", 2);
        int n = Integer.parseInt(line[0]);
        int x = Integer.parseInt(line[1]);

        EatState state = eat(n, new EatState(x, 0));
        System.out.println(state.pati());
    }

    public EatState eat(int level, EatState state) {
        if (state.toEat() == 0) {
            return state;
        }

        if (level == 0) {
            return new EatState(state.toEat() - 1, state.pati() + 1);
        } else {
            int toEat = state.toEat();
            int pati = state.pati();
            toEat--; // ban

            if (toEat > 0) { // level - 1 burger
                state = this.eat(level - 1, new EatState(toEat, pati));
                toEat = state.toEat();
                pati = state.pati();
            }
            if (toEat > 0) { // pati
                toEat--;
                pati++;
            }
            if (toEat > 0) { // level - 1 burger
                state = this.eat(level - 1, new EatState(toEat, pati));
                toEat = state.toEat();
                pati = state.pati();
            }
            if (toEat > 0) { // ban
                toEat--;
            }
            return new EatState(toEat, pati);
        }
    }
}
