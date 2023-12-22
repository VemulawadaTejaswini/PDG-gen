import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	 public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  double[] v = new double[n];
	  for(int i = 0; i < n; i++) {
		  v[i] = sc.nextInt();
	  }
	  Arrays.sort(v);
	  double sum = (v[0]+v[1])/2; 
	  for(int i = 2; i < n; i++) {
		  sum = (sum+v[i])/2;
	  }
	  System.out.println(sum);
	}
}