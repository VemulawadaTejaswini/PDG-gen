import java.util.*;
import java.lang.Math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int X = sc.nextInt();
      	int N = 0;
      	for(N = 0 ; A*N+B*intLength(N)<X ; N++){
        	
        }
      	System.out.println(String.valueOf(N));
    }
  	public static int numberLength(int userNumber) {

    	int numberCounter = 10;
    	boolean condition = true;
    	int digitLength = 1;

    	while (condition) {
        	int numberRatio = userNumber / numberCounter;
        	if (numberRatio < 1) {
            	condition = false;
        	} else {
            	digitLength++;
            	numberCounter *= 10;
        	}
    	}
    	return digitLength; 
	}
}