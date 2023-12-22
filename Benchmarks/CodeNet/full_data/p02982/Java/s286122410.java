import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
      	int n = s.nextInt();
      	int d = s.nextInt();
      	int counter = 0;
      	int[][] x = new int[n][d];
      	for(int i = 0; i < n; i ++){
        	for(int j = 0; j < d; j ++){
            	x[i][j] = s.nextInt();
            }
        }
      	for(int i = 0; i < n-1; i ++){
        	for(int j = i + 1; j < n; j ++){
            	if(distance(x[i], x[j], d)){
                	counter ++;
                }
            }
        }
      	System.out.print(counter);
      	
    }
  	public static boolean distance(int[] x, int[] y, int d){
      	int sum = 0;
    	for(int k = 0; k < d; k++){
        	sum += (x[k] - y[k]) * (x[k] - y[k]); 
        }
      	if(Math.sqrt(sum) == (int)(Math.sqrt(sum))){
        	return true;
        }
      	else{
        	return false;
        }
    }
}