import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int N = scanner.nextInt();
      
      	for(int i = 2; i < 10; i++) {
      		if(N % i == 0 && (N / i) / 10 == 0) {
        		System.out.println("Yes");
         		return;
        	}
    	}
      	System.out.println("No");
	}
}
 

 

