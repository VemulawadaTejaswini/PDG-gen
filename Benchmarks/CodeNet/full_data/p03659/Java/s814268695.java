import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		long up = 0;
		long down = 0;
		long diffMin = 0;
		for (int i=0; i<n-1; i++){
			if (i==0){
				up = a[0];
				for (int j=1; j<n; j++){
					down += a[j];
				}
				diffMin = Math.abs(up - down);
			} else {
				up += a[i];
				down -= a[i];
				diffMin = Math.min(diffMin, Math.abs(up - down));
			}
		}
		System.out.println(diffMin);
	}

}
