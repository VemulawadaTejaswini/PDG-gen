import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cap = scan.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];

        for(int i = 0 ; i < n ; i++) {
            weights[i] = scan.nextInt();
            values[i] = scan.nextInt();
        }
        System.out.println(helper(0, weights, values, cap, new HashMap<Integer, Map<Integer, Long>>()));
    }
    private static long helper(int index, int[] weights, int[] values, int cap, Map<Integer, Map<Integer, Long>> cache){
        long pick = 0;
        if(cache.containsKey(index) && cache.get(index).containsKey(cap)) return cache.get(index).get(cap);
        if(cap < 0) return 0;
        if(index == weights.length) return 0;
        if(cap >= weights[index]){
            pick = values[index]+helper(index+1, weights, values, cap-weights[index], cache);
        }
        long nopick = helper(index+1, weights, values, cap, cache);
        cache.putIfAbsent(index, new HashMap<>());
        long max = Math.max(pick, nopick);
        cache.get(index).put(cap, max);
        return max;
    }
}