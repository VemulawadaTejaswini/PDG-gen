import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int sum = 0;
      int k = 0;
      int sum2 = 0;
      for(int i = 0;i < n;i++){
        a[i]=sc.nextInt();
        sum += a[i];
        sum2 += a[i]*a[i];
      }
      if((double)sum/n-sum/n >= sum/n+1-(double)sum/n)k = sum/n+1;
      else k=sum/n;
      System.out.println(n*k*k-2*k*sum+sum2);
    }
}