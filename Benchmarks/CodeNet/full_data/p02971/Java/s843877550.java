
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        
        int max = 0;
        int max2 = 0;
        
        for (int i = 0; i < n; i ++) {
        	a[i] = s.nextInt();
        	if (a[i] > max) {
        		max2 = max;
        		max = a[i];
        	} else if (a[i] > max2 && a[i] <= max)
        		max2 = a[i];
        }
        
        for (int i : a) {
        	if (i == max)
        		System.out.println(max2);
        	else
        		System.out.println(max);
        }
        
	}
}