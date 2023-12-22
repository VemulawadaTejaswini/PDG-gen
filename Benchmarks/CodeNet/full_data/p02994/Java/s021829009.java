import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int l = sc.nextInt();
      
      int[] a = new int[n];
      
      int sum = 0;
      int min = 400;
      int b = 0;
      for(int i = 0; i < n; i++) {
        a[i] = l;
        sum+= l;
        if(min > Math.abs(a[i])) {
          min = Math.abs(a[i]);
          b = a[i];
        }
        l++;
      }
      
           System.out.println(sum - b);
           
           
      
           

      
	}
}