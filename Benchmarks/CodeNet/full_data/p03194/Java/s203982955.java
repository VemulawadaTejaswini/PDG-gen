import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String args[]) {
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	long P = sc.nextLong();
    	TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
    	int answer = 1;
    	
    	int i = 2;
    	long y = P;
    	while(y != 1) {
    	    if(y % i == 0) {
    	    	if(treeMap.containsKey(i)) {
    	            int currentNum = treeMap.get(i);
    	            //System.out.println("current num of "+i+" : "+currentNum);
    	            if(currentNum == N-1) {
    	        	    treeMap.put(i, currentNum-N-1);
    	        	    answer *= i;
    	            }
    	            else {
    	        	    treeMap.put(i, currentNum+1);
    	            }
    	    	} else {
    	    		//System.out.println("1st time to put "+i);
    	    		treeMap.put(i, 1);
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