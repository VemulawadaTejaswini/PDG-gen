import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
	  
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int total = 0;
    int count = 0;
    for(int i = 0; i < N; i++){
    	A[i] = sc.nextInt();
    }
    
    for(int s = 0; s < N; s++){
    	for(int t = s; t < N ; t++){
    		total += A[t];
    		if(total == 0){
    			count++;
    		}
    	}
    	total = 0;
    }
      
    System.out.println(count);
  }
}