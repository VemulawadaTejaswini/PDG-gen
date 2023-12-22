import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        List<Integer> products = new ArrayList<>(Arrays.asList(100, 101, 102, 103, 104, 105));
        List<Integer> p = IntStream.rangeClosed(0, target).map(e -> e == 0 ? e : -1).boxed().collect(Collectors.toList());
        for (int product : products) {
            for (int j = 0; j <= target; j++) {
                if (p.get(j) >= 0) p.set(j, 1000000);
                else if (j < product || p.get(j - product) <= 0) p.set(j, -1);
                else p.set(j, p.get(j - product) - 1);
            }
        }

        System.out.println(p.get(target) >= 0 ? 1 : 0);
    }
}
