import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] gram = new int[n];
		int min = 1000;
		
		for(int i = 0; i < n; i ++) {
			gram[i] = sc.nextInt();
			x -= gram[i];
			if(min > gram[i]) {
				min = gram[i];
				
			}
		}
		
		int j = x / min;
		System.out.println(n + j);
		
	}
}
