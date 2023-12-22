import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    	
    	Scanner sc = new Scanner(System.in);
    	long N = sc.nextLong();
    	long P = sc.nextLong();
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