import java.util.*;
import java.lang.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int d = scan.nextInt();
      	int[][] x = new int[n][d];
      	int counter =0;
      for(int j = 0 ; j < n; j ++){
      	for(int i = 0; i < d; i ++){
       		x[j][i] = scan.nextInt(); 	
        }
      }
      for(int i = 0; i < n - 1 ; i ++){
        int sum = 0; 
      	for(int j = i + 1; j < n ; j ++){
          for(int k = 0; k < d; k ++){
          	sum += ((x[j]*x[i] - x[i]*x[i]) * (x[j]*x[i] - x[i]*x[i]));
          }
          if(Math.sqrt(sum) == (int)(Math.sqrt(sum))){
          	counter++;
          }
        }
      }
      System.out.print(counter);
    }	
 
}