import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int[] x = new int[n];
	for(int i = 0; i < n; i++) {
		x[i] = sc.nextInt();
	}
	
	sc.close();
	
	int sum = 0;
	
	for(int i = 0; i < n; i++) {
		if(x[i] * 2 > (k - x[i]) * 2) {
			sum += (k - x[i]) * 2;
		}else {
			sum += x[i] * 2;
		}
	}
	
	System.out.println(sum);
}
}
