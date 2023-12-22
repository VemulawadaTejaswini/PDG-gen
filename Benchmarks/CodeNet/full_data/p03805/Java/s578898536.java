import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<HashSet<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i, new HashSet<>());
        while (m-- > 0) {
            int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
            list.get(a).add(b);
            list.get(b).add(a);
        }

        Stack<Data> stack = new Stack<>();
        stack.push(new Data(0, new boolean[n]));
        int ans = 0;

        while (!stack.isEmpty()) {
            Data d = stack.pop();
            int from = d.i;
            boolean[] isVisited = d.b;

            isVisited[from] = true;
            if (allVisited(isVisited)) ans++;
            HashSet<Integer> to = list.get(from);

            for (int go : to) if (!isVisited[go]) stack.push(new Data(go, Arrays.copyOf(isVisited, n)));
        }

        System.out.println(ans);
    }

    private static boolean allVisited(boolean[] isVisited) {
        for (boolean b : isVisited) {
            if (!b) return false;
        }
        return true;
    }
}
class Data {
    int i;
    boolean[] b;

    Data(int i, boolean[] b) {
        this.i = i;
        this.b = b;
    }
}