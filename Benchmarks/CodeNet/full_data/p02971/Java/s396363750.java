import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] a = new int[n];
      	for(int i = 0; i < n; i ++){
        	a[i] = scan.nextInt();
        }
      	for(int j = 0;j < n; j++){
          	int swap = a[j];
        	a[j] = 0;
          	Arrays.sort(a);
          	System.out.print(a[n]);
          	a[j] = swap;
        }
    }
}