import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<List<Integer>> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            l.add(Arrays.asList(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
        }

        l.sort(Comparator.comparingInt(o -> o.get(1)));

        int time = 0;
        for (List<Integer> list : l) {
            time += list.get(0);
            if (time > list.get(1)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
