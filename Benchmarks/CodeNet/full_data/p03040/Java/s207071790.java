import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();

        long b = 0;
        long aSum = 0;
        long count = 0;
        for (int i = 0; i < Q; i++) {
            int q = sc.nextInt();
            if (q == 1) {
                A.add(sc.nextInt());
                aSum += A.get(A.size()-1);
                b += sc.nextInt();
                count++;
            } else if (q == 2) {
                A.sort(Comparator.naturalOrder());
                long x = A.get((A.size() - 1) / 2);
                System.out.println(x + " " + (aSum + b - (x * count)));
            }
        }

        sc.close();
    }
}
