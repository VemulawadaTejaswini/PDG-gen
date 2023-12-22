import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();

        long b = 0;
        for (int i = 0; i < Q; i++) {
            int q = sc.nextInt();
            if (q == 1) {
                A.add(sc.nextInt());
                b += sc.nextInt();
            } else if (q == 2) {
                A.sort(Comparator.naturalOrder());
                int x = A.get((A.size() - 1) / 2);
                long aSum = 0;
                for (int j : A) {
                    aSum += Math.abs(x - j);
                }
                System.out.println(x + " " + (aSum + b));
            }
        }

        sc.close();
    }
}
