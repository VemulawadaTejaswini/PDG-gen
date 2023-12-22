import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int N = scanner.nextInt();
      	int K = scanner.nextInt();
      
      	int[] dislikeNumber = new int[K];
      	Integer[] dislikeNumberInteger = new Integer[K];

      	for(int i = 0; i < K; i++) {
          	dislikeNumberInteger[i] = Integer.valueOf(scanner.nextInt());
        }

      	int devidedNumber = N;
      	int answer = N;
		first:while(true) {
      		for(int i = 3; i > -1; i--) {
          		int quotient = devidedNumber / (int) Math.pow(10, i);
          		if(Arrays.asList(dislikeNumberInteger).contains(quotient)) {
            		devidedNumber = devidedNumber + 1;
              		answer = answer + 1;
             		continue first;
            	}
          		devidedNumber = devidedNumber % (int) Math.pow(10, i);
        	}
          	break;
        }
          
       	System.out.println(answer);  	
	}
}
 

 

