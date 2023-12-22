import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t[] = new int [10000];
		int x[] = new int [10000];
		int y[] = new int [10000];
		for(int i = 0; i < n; i++) {
			 t[i] = sc.nextInt();
			 x[i] = sc.nextInt();
			 y[i] = sc.nextInt();
		}
		if(t[0] % 2 == 1 && x[0] + y[0] == 0) {
			System.out.println("No");
    		return;
		}else if(t[0] < Math.abs(x[0]) + Math.abs(y[0]) 
		   || t[0] % 2 == 1 && (Math.abs(x[0]) + Math.abs(y[0])) % 2 == 0 
		   || t[0] % 2 == 0 && (Math.abs(x[0]) + Math.abs(y[0])) % 2 == 1) {
				System.out.println("No");
        		return;
		}
		for(int i = 1; i < n; i++) {
			if((t[i] - t[i - 1]) % 2 == 1 && (x[i] - x[i - 1]) + (y[i] - y[i - 1]) == 0) {
				System.out.println("No");
        		return;
			}
			else if(t[i] - t[i - 1] < Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1])
				   ||(t[i] - t[i - 1]) % 2 == 1 && (Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1])) % 2 == 0
			       ||(t[i] - t[i - 1]) % 2 == 0 && (Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1])) % 2 == 1) {
					System.out.println("No");
		            return;
				}
		}
		System.out.println("Yes");
	}
}
