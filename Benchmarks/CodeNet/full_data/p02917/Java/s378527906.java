import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();

    	int[] b = new int[n-1];
    	for(int i = 0; i < n-1; i++) {
    		b[i] = sc.nextInt();
    	}
    	
    	int[] a = new int[n];
    	for(int i = 0; i < n; i++) {
    		a[i] = 0;
    	}
    	
    	a[0] = b[0];
    	a[1] = b[0];
    	for(int i = 1; i < n-1; i++) {
    		if(a[i] > b[i]) {
    			a[i] = b[i];
    		}
    		a[i+1] = b[i];
    	}
    	
    	int ans = 0;
    	for(int i = 0;i < n; i++) {
    		ans = ans + a[i];
    		//System.out.println(a[i]);
    	}

    	System.out.println(ans);

	}

}
