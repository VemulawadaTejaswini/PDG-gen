import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        PriorityQueue<Integer> a = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < m; i++) {
            int u = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            for (int j = 0; j < u; j++) {
                if (a.peek() < v) {
                    a.poll();
                    a.add(v);
                }
            }
        }
        sc.close();
        long sum = 0;
        Integer b[] = a.toArray(new Integer[0]);
        for (int i = 0; i < a.size(); i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }
}