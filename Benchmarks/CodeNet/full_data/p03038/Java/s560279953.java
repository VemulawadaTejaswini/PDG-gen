import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < m; i++) {
            int u = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            for (int j = 0; j < u; j++) {
                a.add(v);
            }
        }
        a.sort(Comparator.reverseOrder());
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        System.out.println(sum);
    }
}