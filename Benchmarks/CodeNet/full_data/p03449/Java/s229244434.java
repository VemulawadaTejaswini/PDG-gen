import java.util.*;
public class Main {
      public static void main(String[]args) {
    	  int sum=0;
    	  Scanner scan=new Scanner(System.in);
    	  int column=scan.nextInt();
    	  int[][] nums=new int[2][column];
    	  for(int row=0;row<2;row++) {
    		  for(int co=0;co<column;co++) {
    		  nums[row][co]=scan.nextInt();
    		  }
    	  }
    	  for(int i=0;i<column;i++) {
    		  int solve=0;
    		  int j,k;
    		  for(j=0;j<=i;j++) {
    			  solve+=nums[0][j];
    		  }
    		  for(k=i;k<column;k++) {
    			  solve+=nums[1][k];
    		  }
    		  if(solve>sum) {
    			  sum=solve;
    		  }
    	  }
    	  System.out.println(sum);
      }
}
