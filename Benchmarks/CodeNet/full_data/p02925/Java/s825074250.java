import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer>[] q = new Queue[n];
        for (int i = 0; i < n; i++) {
            q[i] = new ArrayDeque<>(n - 1);
            for (int j = 0; j < n - 1; j++) {
                q[i].offer(sc.nextInt() - 1);
            }
        }
        int c = 0;
        while (true) {
            boolean[] isSelected = new boolean[n];
            boolean hasGame = false;
            for (int i = 0; i < n; i++) {
                if (!q[i].isEmpty() && !isSelected[i]) {
                    Integer j = q[i].peek();
                    if (j != null && !isSelected[j] && Integer.valueOf(i).equals(q[j].peek())) {
                        isSelected[i] = true;
                        isSelected[j] = true;
                        q[i].poll();
                        q[j].poll();
                        hasGame = true;
                    }
                }
            }
            if (hasGame) {
                c++;
            } else {
                break;
            }
        }
        System.out.println(c == 0 ? -1 : c);
    }
}
