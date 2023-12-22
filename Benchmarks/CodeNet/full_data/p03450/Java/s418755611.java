import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<LinkedList<Tuple>> list = new ArrayList<>();
        for(int i = 0; i <= n; i++) list.add(new LinkedList<Tuple>());
        int[] memo = new int[3];
        for (int i = 0; i < m; i++) {
            memo[0] = sc.nextInt();
            memo[1] = sc.nextInt();
            memo[2] = sc.nextInt();
            System.out.println(list);
            for (Tuple t2 : list.get(memo[1])) {
                System.out.println(list.get(memo[1]).size());
                list.get(memo[0]).add(new Tuple(memo[1], memo[2] + t2.y));
                //list.get(memo[1]).add(new Tuple(memo[0], t2.y - memo[2]));
            }
            list.get(memo[0]).add(new Tuple(memo[1], memo[2]));
            list.get(memo[1]).add(new Tuple(memo[0], -memo[2]));
            for (Tuple t : list.get(memo[0])) {
                System.out.println(t);
                if (t.x == memo[1] && t.y != memo[2]) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
    static class Tuple {
        public final int x;
        public final int y;
        public Tuple(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}