import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] order = new int[n];
		
		for(int i = 0; i < n; i++) {
			order[i] = i+1;
		}
		
		int [] reverseOrder = new int[n];
		for(int i = 0; i < n; i++) {
			reverseOrder[i] = order[n-i-1];
		}
		
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			max += order[i] % reverseOrder[i];
		}
		System.out.println(max);
	}

}
