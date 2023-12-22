import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<List<Long>> robots = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long l = sc.nextLong();
            robots.add(Arrays.asList(x - l, x + l));
        }

        List<List<Long>> result = new ArrayList<>();
        result.add(robots.get(0));
        for (int i = 1; i < robots.size(); i++) {
            long from = result.get(result.size() - 1).get(0);
            long to = result.get(result.size() - 1).get(1);

            long curL = robots.get(i).get(0);
            long curR = robots.get(i).get(1);

            if (from < curL && curL < to) {
                continue;
            }
            if (from < curR && curR < to) {
                continue;
            }
            result.add(robots.get(i));
        }


        System.out.println(result.size());
    }

}