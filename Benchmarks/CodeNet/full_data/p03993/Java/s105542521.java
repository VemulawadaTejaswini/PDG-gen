import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n + 1];
    	int i = 1;
    	while(i <= n) {
    		a[i] = sc.nextInt();
    		i++;
    	}
    	int count = 0;
    	for (i = 1; i <= n; i++) {
    		int ai = a[i]; // 2
    		int aj = a[ai]; // 1
    		if (i == aj) {
    			count ++;
    		}
    		// 2 1 4 3
    		// 1 2 3 4
    		
    	}
    	System.out.println(count/2);
    }
}