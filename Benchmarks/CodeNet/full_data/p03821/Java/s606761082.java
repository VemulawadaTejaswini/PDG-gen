import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = in.nextInt();
		int[] a = new int[n], b = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		int sum = 0;
		for(int i = n - 1; i > -1; i--){
			if((a[i] + sum) % b[i] != 0){
				sum += b[i] - ((a[i] + sum) % b[i]);
			}
		}
		System.out.println(sum);
	}
}