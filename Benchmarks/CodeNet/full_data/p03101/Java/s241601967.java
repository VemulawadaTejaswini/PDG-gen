import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int counter = 0;
      	int N = scan.nextInt();
      	int M = scan.nextInt();
      	int C = scan.nextInt();
      	int[] B = new int[M];
      	for(int i = 0; i < M; i++){
        	B[i] = scan.nextInt();
        }
      	for(int k = 0; k < N; k++){
      		int[] A = new int[M];
      		for(int i = 0; i < M; i++){
        		A[i] = scan.nextInt();
        	}
      		int sahen = 0;
      		for(int j = 0; j < M; j++){
        		sahen = sahen + A[j] * B[j];
        	}
      		if(sahen + C > 0){
        		counter++;
        	}
        }
      	System.out.print(counter);
      	
    }
 
}