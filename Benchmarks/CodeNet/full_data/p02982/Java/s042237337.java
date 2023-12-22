import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int d = sc.nextInt();
      int[][] array = new int[n][d];
      int count = 0;
      int sum = 0;
      for(int i = 0;i < n;i++) {
    	  for(int j = 0;j < d;j++) {
    		  array[i][j] = sc.nextInt();
    	  }
      }
      for(int i = 0;i < n;i++) {
    	  for(int k = 1;k < n-i;k++) {
    		  for(int j = 0;j < d;j++) {
    			  sum += (array[i][j]-array[i+k][j])*(array[i][j]-array[i+k][j]);
    		  }
    		  if(Math.sqrt(sum) == (int)Math.sqrt(sum)) count++;
        	  sum = 0;
    	  }
      }
      System.out.println(count);
      sc.close();
    }
}