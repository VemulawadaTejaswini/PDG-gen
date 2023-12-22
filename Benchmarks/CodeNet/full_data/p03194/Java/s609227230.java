import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String args[]) {
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	long P = sc.nextLong();
    	TreeMap<Long, Integer> treeMap = new TreeMap<Long, Integer>();
    	int answer = 1;
    	long limit = P/N;
    	long i = 2;
    	long y = P;
    	while(y != 1 && i <= limit) {
    	    if(y % i == 0) {
    	    	if(treeMap.containsKey(i)) {
    	            int currentNum = treeMap.get(i);
    	            if(currentNum == N-1) {
    	        	    treeMap.put(i, currentNum-N-1);
    	        	    answer *= i;
    	            }
    	            else {
    	        	    treeMap.put(i, currentNum+1);
    	            }
    	    	} else {
    	    		treeMap.put(i, 1);
    	    		if(N==1) {
    	    			answer *= i;
    	    		}
    	    	}
    	        y /= i;
    	    }
    	    else {
    	        i++;
    	    }
    	}
    	
	    System.out.println(answer);
    }
}