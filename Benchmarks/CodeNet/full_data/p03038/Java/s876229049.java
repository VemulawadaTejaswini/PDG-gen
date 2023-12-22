import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i=0; i < n; i++)
            a.add(sc.nextInt());

        List<Map.Entry<Integer, Integer>> bc = new ArrayList<>();
        for (int i=0; i < m; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            bc.add(new AbstractMap.SimpleEntry<>(b, c));
        }
        bc.sort((o1, o2) -> o2.getValue() - o1.getValue());

        for (Map.Entry<Integer, Integer> abc : bc) {
            Collections.sort(a);
            int b = abc.getKey();
            int c = abc.getValue();

            for (int j=0; j < b; j++) {
                if (a.get(j) < c)
                    a.set(j, c);
                else
                    break;
            }
        }

        long ans = 0;
        for (int i : a)
            ans += i;
        System.out.println(ans);

    }
}
