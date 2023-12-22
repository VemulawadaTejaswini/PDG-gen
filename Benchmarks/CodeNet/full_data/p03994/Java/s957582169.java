import java.nio.CharBuffer;
import java.util.Scanner;

class Solver {

    private final String S;
    private final int K;

    Solver(Scanner in){
        S = in.next();
        K = in.nextInt();
    }

    void solve() {
        char[] chars = S.toCharArray();
        int remaining = K;
        for (int i = 0; i < chars.length; i++) {
            if ('z' - chars[i] + 1 <= Math.min(25, remaining)) {
                remaining -= 'z' - chars[i] + 1;
                chars[i] = 'a';
            }
        }
        chars[chars.length - 1] += remaining % 26;
        System.out.println(CharBuffer.wrap(chars));
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}