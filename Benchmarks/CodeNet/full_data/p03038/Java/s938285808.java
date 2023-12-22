import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        Collections.sort(a);

        int[][] bc = IntStream.range(0, m).mapToObj(i -> new int[] {scanner.nextInt(), scanner.nextInt()}).sorted(Comparator.<int[]>comparingInt(ar -> ar[1]).reversed()).toArray(int[][]::new);

        System.out.println(Arrays.deepToString(bc));
        long sum = 0;

        System.out.println(a);
        for (int[] array : bc) {
            for (int i = 0; i < array[0]; i++) {
                if (a.get(0) >= array[1]) {
                    break;
                }
                a.remove(0);
                sum += array[1];
            }
        }

        for (Integer i : a) {
            sum += i;
        }

        System.out.println(sum);
    }
}