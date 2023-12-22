import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int P[] = new int[M];
		int Y[] = new int[M];
		
		for(int i=0; i<M; i++){
			P[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		
		for (int i=0; i<M; i++){
			System.out.print(String.format("%06d", P[i]));
			int k = 0;
			for (int j=0; j<M; j++){
				if (P[i] == P[j]){
					k++;
				}
			}
			int z[] = new int[k];
			int l = 0;
			for (int j=0; j<M; j++){
				if (P[i] == P[j]){
					z[l] = Y[j];
					l++;
				}
			}
			Arrays.sort(z);
//			for (int j=0; j<k; j++){
//				System.out.println("+++ "+z[j]);
//			}
			
			for (int j=0; j<k; j++){
				if (Y[i] == z[j]){
					System.out.println(String.format("%06d", j+1));
				}
			}
			
//			System.out.println("---");
		}
		
		return;
		
		
	}
	
}
