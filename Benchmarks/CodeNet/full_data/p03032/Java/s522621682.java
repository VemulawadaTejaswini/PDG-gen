import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int k = sc.nextInt();
	   int[] v = new int[n];
	   for(int i = 0; i < n; i++) {
		   v[i] = sc.nextInt();
	   }
	   ArrayList<Integer> list = new ArrayList<>();
	   int tim = Math.min(n, k);
	   int ans = 0;
	   for(int a = 0; a <= tim; a++) {
		   for(int b = 0; b <= tim-a; b++) {
			   if (a == b && b == 0)
					continue;
			   list.clear();
			   for(int i = 0; i < a; i++) {
				   list.add(v[i]);
			   }
			   for(int i = 0; i < b; i++) {
				   list.add(v[n-i-1]);
			   }
			   Collections.sort(list);
			   int i = 0;
			   while(i<k-(a+b)&&i<a+b&&list.get(i)<0) {
				   i++;
			   }
			   int sum = 0;
			   for(;i < a+b; i++) {
				   sum+=list.get(i);
			   }
			   if(ans<sum)ans = sum;
		   }
	   }
	   System.out.println(ans);
	}
}