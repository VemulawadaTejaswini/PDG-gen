import java.util.Scanner;

public class Main {
    static int K;
    static int[] opt;
    static int[] stones;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        K = s.nextInt();
        stones = new int[N];
        for(int i = 0; i < N; i++){
            stones[i] = s.nextInt();
        }
        opt = new int[N];
        int cost = solve(N-1, 0);
        System.out.println(cost);
    }

    public static int solve(int index, int cost){
        if(index == 0){
            return cost;
        }
        if(opt[index] != 0){
            return opt[index] + cost;
        }
        int optIndex = 0;
        int min = Integer.MAX_VALUE;
        for(int i = Math.max(0, index - K); i < index; i++){
            int newCost = solve(i, cost + Math.abs(stones[i] - stones[index]));
            if(newCost < min){
                optIndex = i;
                min = newCost;
            }
        }
        opt[optIndex] = min;
        return min;
    }
}
