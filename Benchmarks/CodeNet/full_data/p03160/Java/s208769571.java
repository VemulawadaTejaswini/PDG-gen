import java.util.Scanner;
import java.util.Arrays;
public class Main1 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int N = Integer.parseInt(scanner.nextLine());
                int[] costs = new int[N];
                int[] cache = new int[N];
                String[] c = scanner.nextLine().split(" ");
                for(int i = 0 ; i < N ; i++) {
                        costs[i] = Integer.parseInt(c[i]);
                        cache[i] = 1000000;
                }
                cache[0] = 0;
                //cache[1] = Math.abs(costs[1] - costs[0]);
                System.out.println(jump(costs, 2, cache));
                return;
        }
        private static int jump(int[] costs, int k, int[] cache) {
                for(int i = 0 ; i < costs.length ; i++) {
                        // for every i - check the next k cells and update if the cost from current cell is better.
                        for(int j = i-1 ; j >= i-k ; j--) {
                                //ith cell of cache will have min of i-jth cell + its cost from coming there.
                                // if it has already lower value, lets keep that as is.
                                if(j >= 0)
                                        cache[j] = Math.min(cache[i], cache[j]+Math.abs(costs[j] - costs[i]));
                        }
                        //System.out.println(Arrays.toString(cache));
                }
                return cache[costs.length-1];
        }
}