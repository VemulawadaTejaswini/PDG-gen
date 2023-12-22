import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Vec2 {
    private final int x;
    private final int y;

    Vec2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Solver {

    private final String S;
    private final int Q;
    private final Vec2[] ranges;

    Solver(Scanner in){
        in.nextInt();
        Q = in.nextInt();
        S = in.next();
        ranges = new Vec2[Q];
        for (int i = 0; i < Q; i++) {
            ranges[i] = new Vec2(in.nextInt() - 1, in.nextInt() - 1);
        }
    }

    void solve() {
        char[] chars = S.toCharArray();
        boolean prev = chars[0] == 'A';
        int sum = 0;
        int[] cur = new int[chars.length];
        for (int i = 1; i < chars.length; i++) {
            if (prev && chars[i] == 'C') sum++;
            cur[i] = sum;
            prev = chars[i] == 'A';
        }
        cur[chars.length - 1] = sum;
        System.out.println(Arrays.stream(ranges).mapToInt(p -> cur[p.getY()] - cur[p.getX()]).mapToObj(String::valueOf).collect(Collectors.joining("\n")));
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}