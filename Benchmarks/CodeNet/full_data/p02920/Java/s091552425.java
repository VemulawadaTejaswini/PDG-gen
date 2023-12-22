import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            list.add(sc.nextInt());
        }
        list.add(0);
        list.add(Integer.MAX_VALUE);
        Collections.sort(list);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> next = new PriorityQueue<>();
        queue.add(- list.remove(list.size() - 2));
        for (int i = 0; i < n; i++) {
            while (queue.size() > 0) {
                int x = - queue.poll();
                int left = 0;
                int right = list.size();
                while (right - left > 1) {
                    int m = (left + right) / 2;
                    if (list.get(m) < x) {
                        left = m;
                    } else {
                        right = m;
                    }
                }
                if (left == 0) {
                    System.out.println("No");
                    return;
                }
                next.add(- x);
                next.add(- list.remove(left));
            }
            PriorityQueue<Integer> tmp = next;
            next = queue;
            queue = tmp;
        }
        System.out.println("Yes");
    }
}