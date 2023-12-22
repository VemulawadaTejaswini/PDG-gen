import java.util.Scanner;

public class Main {
	private static Scanner stdIn;

	public static void main(String[] args) {
		stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		
		int[] L = new int[2 * a];
		
		for(int i = 0;i < 2 * a;i++) {
			L[i] = stdIn.nextInt();
		}
		
      int k = 0;
      
		for(int j = 0;j < 2 * a;j++) {
			for(int i = 0;i < 2 * a - 1;i++) {
				if(L[i] > L[i + 1]){
                  k = L[i];
                  L[i] = L[i + 1];
                  L[i + 1] = k;
                }
			}
		}
		
		int n = 0;
		
		for(int i = 0;i < a;i++) {
			n += L[2 * i];
		}
		
		System.out.println(n);
	}
}