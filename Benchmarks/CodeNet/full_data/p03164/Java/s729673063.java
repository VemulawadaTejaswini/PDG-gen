
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {

    public Solution(Scanner in) {
        N = in.nextInt();
        W = in.nextInt();

        w = new ArrayList<>();
        v = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            w.add(in.nextInt());
            v.add(in.nextInt());
        }
    }

    private int N;
    private int W;

    private List<Integer> w;
    private List<Integer> v;

    public int calculate() {
        int weight = W;
        int amount = 0;
        calculate(weight, amount, N - 1);
        return 0;
    }

    private int calculate(int weight, int amount, int pos) {
        if (pos == -1 || weight == 0) return 0;

        if (w.get(pos) > weight) return calculate(weight, amount, pos - 1);

        int no = calculate(weight, amount, pos - 1);
        int yes = v.get(pos) - calculate(weight, amount, pos - 1);
        return Math.max(no, yes);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Solution s = new Solution(in);
        int result = s.calculate();
        System.out.println(result);
    }

}
