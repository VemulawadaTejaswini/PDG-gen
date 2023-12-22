import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int N = scanner.nextInt();
      
      	int[] array = new int[N];

      	for(int i = 0; i < N; i++) {
          	array[i] = scanner.nextInt();
            //System.out.println(array[i]);
        }
      	int plus = 0;
      	int sum = 0;
      	for(int j = 0; j < N; j++) {
        	plus = plus + (int) Math.pow(array[j], 2);
          	sum = sum + array[j];
        }
      
     	System.out.println(plus - (int) Math.pow(sum, 2) / N);
      	
	}
}
 

 

