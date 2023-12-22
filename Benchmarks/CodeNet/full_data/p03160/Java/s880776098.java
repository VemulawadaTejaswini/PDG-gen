package codechef;

import java.util.HashMap;
import java.util.Scanner;

class ATM {
	static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
         
        }
        System.out.print(calculate(a, 0, a.length));
    	
    }
    
    public static int calculate(int[] stones, int current, int lenStones){
    	if(current == lenStones) {
    		return 0;
    	}
    	
    	if(map.containsKey(current)) {
    		return map.get(current);
    	}
    	
    	int dOneStep = Integer.MAX_VALUE;
    	if(current+ 1<stones.length) {
    		dOneStep = Math.abs(stones[current] - stones[current+1]) + calculate(stones, current+1, lenStones);
    	}
    	
    	int dTwoStep = Integer.MAX_VALUE;
    	if(current+ 2<stones.length) {
    		dTwoStep = Math.abs(stones[current] - stones[current+2]) + calculate(stones, current+2, lenStones);
    	}
    	
    	int minMum = Math.min(dOneStep, dTwoStep);
    	map.put(current, minMum);
    	
    	return minMum;
    }
}
  