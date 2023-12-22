import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[] v = new int[N];
			
			for(int i =0;i<N;i++) {
				v[i] = scan.nextInt();
			}
			
			Arrays.sort(v);
			
			double saigo=v[0];
			
			for(int i = 1;i<=N-1;i++) {
				saigo =(saigo+v[i])/2; 
			}
			
			
			System.out.println(saigo);
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
