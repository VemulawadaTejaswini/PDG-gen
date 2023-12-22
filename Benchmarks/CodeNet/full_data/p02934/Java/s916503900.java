import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	 public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  double sum = 0;
	  for(int i = 0; i < n; i++) {
		  double a = sc.nextDouble();
		  sum+=1/a;
	  }
	  sum = 1/sum;
	  System.out.println(sum);
	}
}