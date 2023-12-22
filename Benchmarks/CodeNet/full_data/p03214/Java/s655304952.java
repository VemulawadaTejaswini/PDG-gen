import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      double sum = 0;
      for(int i = 0;i < n;i++){
        a[i]=sc.nextInt();
        sum+=(double)a[i];
      }
      sum/=(double)n;
      int f = 0;
      double min = 10000000;
      for(int i = n-1;i >=0;i--){
      	double k = (double)Math.abs(sum-(double)a[i]);
        min = Math.min(min,k);
        if(min==k)f = i;
      }
      System.out.println(f);
    }
}
