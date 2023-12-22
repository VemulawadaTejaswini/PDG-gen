import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int donutWeights[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			donutWeights[i] = sc.nextInt();
		}
		
		int essentialWeight = 0;
		
		for (int i = 0; i < n; i++) {
			essentialWeight += donutWeights[i];
		}
		
		int min = donutWeights[0];
		
		for (int i = 0; i < n; i++) {
			if (min > donutWeights[i]){
				min = donutWeights[i];
			} 
		}
		
		int minDonatPieces = (x - essentialWeight) / min;
		
		System.out.println(n + minDonatPieces);
	}
}