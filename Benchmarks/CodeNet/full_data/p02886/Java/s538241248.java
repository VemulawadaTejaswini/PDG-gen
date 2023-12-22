import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] d = new int[n];
      	for (int i = 0; i < n; i++) {
        	d[i] = sc.nextInt();
        }
      
      	int ans = 0;
		for (int k = 0; k < d.length - 1; k++) {
			for (int l = k + 1; l < d.length; l++) {
            	ans += d[k] * d[l];
            }
        }
      
      	System.out.println(ans);
    }
}