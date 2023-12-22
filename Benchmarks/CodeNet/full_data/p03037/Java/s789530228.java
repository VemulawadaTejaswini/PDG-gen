import java.util.BitSet;
import java.util.Scanner;

class Solver {
    Solver(Scanner in){
        int N = in.nextInt();
        int M = in.nextInt();
        BitSet bits = new BitSet(N);
        bits.set(0, N);
        for (int i = 0; i < M; i++) {
            BitSet gate = new BitSet(N);
            gate.set(in.nextInt() - 1, in.nextInt());
            bits.and(gate);
        }
        System.out.println(bits.cardinality());
    }

    void solve() {

    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}