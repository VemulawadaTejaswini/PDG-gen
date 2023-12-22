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
    	long currentNum = 0;
    	while(y != 1 && i <= limit) {
    	    if(y % i == 0) {
    	    	currentNum++;
    	    	if(currentNum == N) {
    	    		answer *= i;
    	    		currentNum = 0;
    	    	}
    	        y /= i;
    	    }
    	    else {
    	        i++;
    	        currentNum = 0;
    	    }
    	}
    	
	    System.out.println(answer);
    }
}