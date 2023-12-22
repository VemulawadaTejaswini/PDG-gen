import java.util.Scanner;

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
        System.out.println(helper(0, weights, values, cap, new Long[n+1][cap+1]));
    }
    private static long helper(int index, int[] weights, int[] values, int cap, Long[][] cache){
        long pick = 0;
        if(cache[index][cap] != null) return cache[index][cap];
        if(cap < 0) return 0;
        if(index == weights.length) return 0;
        if(cap >= weights[index]){
            pick = values[index]+helper(index+1, weights, values, cap-weights[index], cache);
        }
        long nopick = helper(index+1, weights, values, cap, cache);
        cache[index][cap] =  Math.max(pick, nopick);
        return cache[index][cap];
    }
}