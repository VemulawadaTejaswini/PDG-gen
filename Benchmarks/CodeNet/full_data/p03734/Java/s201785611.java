import java.util.Scanner;
import java.util.HashMap;

class Main {
    static int n;
    static long w;
    static long[] weights, values;
    static HashMap<String, Long> memo = new HashMap<String, Long>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = sc.nextLong();
        weights = new long[n];
        values = new long[n];
        for (int i = 0; i < n; ++i) {
            weights[i] = sc.nextLong();
            values[i] = sc.nextLong();
        }
        System.out.println(solve(0, 0, 0));
    }

    public static long solve(int index, long weight, long value) {
        String s = index + "," + weight;
        if (w < weight) {
            return Long.MIN_VALUE;
        } else if (memo.containsKey(s)) {
            return memo.get(s);
        } else if (index == n) {
            return value;
        } 
        
        long temp = Math.max(
                             solve(index + 1, weight, value),
                             solve(index + 1, weight + weights[index], value + values[index])
                             );
        memo.put(s, temp);
        
        return temp;
    }
}
