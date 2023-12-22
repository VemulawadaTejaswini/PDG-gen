import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        Arrays.sort(A, Comparator.reverseOrder());
        int a = IntStream.range(0, N).filter(i -> i % 2 == 0).map(i -> A[i]).sum();
        int b = IntStream.range(0, N).filter(i -> i % 2 == 1).map(i -> A[i]).sum();
        int ans = a - b;
        System.out.println(ans);
    }
}