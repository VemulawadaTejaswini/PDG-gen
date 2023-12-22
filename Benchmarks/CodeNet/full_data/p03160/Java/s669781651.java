
import java.util.Scanner;

/**
 *
 * @author German le yo
 */
public class Main{
    
    static int[] stones;
    static int[] state;
    
    public static int getBest(int i){
        // Verify if calculated before
        if(state[i] != 0) return state[i];
        // Base cases
        if(i == 0) return state[i] = 0;
        if(i == 1) return state[i] = Math.abs(stones[0] - stones[1]);
        
        // compare best
        int min1 = getBest(i - 1), min2 = getBest(i - 2);
        int cost = Math.min(Math.abs(stones[i] - stones[i - 1]) + min1, Math.abs(stones[i] - stones[i - 2]) + min2);
        
        // store and return the best
        return state[i] = cost;
        
        
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        state = new int[N];
        stones = new int[N];
        
        for(int i = 0; i < N; i++) stones[i] = scan.nextInt();
        
        System.out.println(getBest(N - 1));
    }
    
}
