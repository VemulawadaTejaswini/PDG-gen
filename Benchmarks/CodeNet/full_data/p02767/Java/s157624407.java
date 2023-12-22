import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
      int[] x = new int[n];
      double sum = 0;
      for (int i=0;i<n;i++){
        x[i]=sc.nextInt();
        sum+=x[i];
      }
      double dn = n;
      int p = (int)Math.round(sum/dn);
      int ans = 0;
      for (int i=0;i<n;i++){
        ans+=Math.pow(Math.abs(x[i]-p),2);
      }
	System.out.println(ans);
    }
}