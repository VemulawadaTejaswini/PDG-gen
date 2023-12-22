import java.util.*;

public class Main {
    public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt(), w = in.nextInt();
        
        int[] val = new int[n];
        int[] wt = new int[n];
        for(int i = 0; i < n; i++)
        {
        	wt[i] = in.nextInt();
        	val[i] = in.nextInt();
        }

        // Populate base cases
        long[][] mat = new long[n + 1][w + 1];
        for (int r = 0; r < w + 1; r++) {
            mat[0][r] = 0;
        }
        for (int c = 0; c < n + 1; c++) {
            mat[c][0] = 0;
        }
        
        // Main logic
        for (int item = 1; item <= n; item++) {
            for (int capacity = 1; capacity <= w; capacity++) {
                long maxValWithoutCurr = mat[item - 1][capacity]; // This is guaranteed to exist
                long maxValWithCurr = 0; // We initialize this value to 0
                
                int weightOfCurr = wt[item - 1]; // We use item -1 to account for the extra row at the top
                if (capacity >= weightOfCurr) { // We check if the knapsack can fit the current item
                    maxValWithCurr = val[item - 1]; // If so, maxValWithCurr is at least the value of the current item
                    
                    int remainingCapacity = capacity - weightOfCurr; // remainingCapacity must be at least 0
                    maxValWithCurr += mat[item - 1][remainingCapacity]; // Add the maximum value obtainable with the remaining capacity
                }
                
                mat[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr); // Pick the larger of the two
            }
        }
        
        System.out.println(mat[n][w]); // Final answer
    }
}