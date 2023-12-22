import java.util.*;

public class Main {
    public static void main(String[] args) {
//        test();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        long[] cities = new long[N];
        for (int i = 0; i < N; i++) {
            cities[i] = sc.nextLong();
        }

        System.out.println(calc(N, A, B, cities));
    }

    private static long calc(int n, int a, int b, long[] cities) {
        long cost = 0;

//        System.out.println(Arrays.toString(cities));
        for (int i = 0; i < n-1; i++) {
            cost += Math.min((cities[i+1] - cities[i])*a, b);
//            System.out.println("Move distance: " + (cities[i+1] - cities[i]) + "cost sum: " + cost);
        }

        return cost;
    }

}
