import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     
	     int n = sc.nextInt();
	     int m = sc.nextInt();
	     
	     int []a = new int [m];
	     int []d = new int [m-1];
	     
	    if(n < m) {
	     for(int i = 0 ; i< m ; i++) {
	    	 a[i] = sc.nextInt();
	     }
	     Arrays.sort(a);
	     int sum = 0;
	     
	     for(int i = 0 ; i < m-1 ; i++) {
	    	 d[i] = Math.abs(a[i+1] - a[i]);
	    	 sum += d[i];
	     }
	     Arrays.sort(d);
	     
	     int i = m-2;
	     while(n > 1) {
	    	 
	    	 sum -= d[i];
	    	 i--;
	    	 n--;
	     }
	     System.out.println(sum);
	    }
	   if(n >= m) {
		   System.out.println(0);
	   }
	}

}
