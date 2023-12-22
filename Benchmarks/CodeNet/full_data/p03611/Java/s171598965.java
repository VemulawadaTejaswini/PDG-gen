import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int []a = new int [n];
       
       for(int i = 0; i< n ;i++) {
    	   a[i] = sc.nextInt();
       }
       Arrays.sort(a);
       
       int maxnum = a[n-1];
       int max = 0;
       
       for(int i = 1 ; i < maxnum; i++) {
    	   int tmp = 0;
    	   for(int j = 0; j < n ; j++) {
    		   if(i == a[j]||(Math.abs(a[j] - i) == 1)) {
    			   tmp++;
    		   }
    	   }
    	   max = Math.max(tmp, max);
       }
       System.out.println(max);
	}

}
