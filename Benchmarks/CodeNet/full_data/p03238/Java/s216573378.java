import java.util.*;
public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	 
	    int n = sc.nextInt();
	    int[][] table = new int[n][4];
	    for(int i = 0; i < n; i++){
	      table[i][0] = sc.nextInt();
	      table[i][1] = sc.nextInt();
	      table[i][2] = sc.nextInt();
	    }
	 
	    for(int x = 0; x <= 100; x++){
	      for(int y = 0; y <= 100; y++){
	        for(int h = Math.max(table[0][2] - 250, 1); h < table[0][2] + 250; h++){
	          boolean check = true;
	          for(int i = 0; i < n; i++){
	            if(table[i][2] != Math.max(h - Math.abs(x - table[i][0]) - Math.abs(y - table[i][1]), 0)){
	              check = false;
	            }
	          }
	          if(check){
	            System.out.print(x);
	            System.out.print(" ");
	            System.out.print(y);
	            System.out.print(" ");
	            System.out.print(h);
	          }
	        }
	 
	 
	      }
	    }
	  }
}