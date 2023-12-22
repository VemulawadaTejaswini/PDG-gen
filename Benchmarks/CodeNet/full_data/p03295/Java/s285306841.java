import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(new int[]{sc.nextInt(), sc.nextInt()});
        }

        Collections.sort(list, Comparator.comparing(a -> a[1]));

        int count = 0;
        int prev = 0;
        if (!list.isEmpty()) {
            count = 1;
            prev = list.get(0)[1] - 1;
        }

        for (int i = 1; i < list.size(); i++) {
            int[] ab = list.get(i);

            if (ab[0] <= prev) {
                continue;
            }

            count++;
            prev = ab[1] - 1;
        }

        System.out.println(count);
    }
}