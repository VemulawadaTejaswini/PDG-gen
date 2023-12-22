import java.util.*;

public class Main {
    public static final int MAX_A = 30000;

    public static void main(String[] args) {
        // read input
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // solve
        if (N == 3) {
            System.out.printf("2 5 63\n");
            return;
        }
        List<Integer> as = new ArrayList<>();
        as.addAll(Arrays.asList(2, 4, 3, 9));
        N -= 4;
        // add multitples of 2
        for (int i = 2; 6 * i - 2 <= MAX_A; i++) {
            if (N < 2) {
                break;
            }
            as.add(6 * i - 2);
            as.add(6 * i - 4);
            N -= 2;
        }
        // add multitples of 3
        for (int i = 2; 12 * i - 3 <= MAX_A; i++) {
            if (N < 2) {
                break;
            }
            as.add(12 * i - 9);
            as.add(12 * i - 3);
            N -= 2;
        }
        // add multiples of 6
        for (int i = 1; 6 * i <= MAX_A; i++) {
            if (N == 0) {
                break;
            }
            as.add(6 * i);
            N--;
        }
        as.forEach(a -> System.out.printf("%d ", a));
        System.out.printf("\n");
    }
}