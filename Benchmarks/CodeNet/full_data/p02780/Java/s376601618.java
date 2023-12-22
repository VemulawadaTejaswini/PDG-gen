import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		double ans = 0;
		ArrayList<Double> numList = new ArrayList<>();
		for(int i = 0; i < k; i++) {
			numList.add(sc.nextDouble());
		}

		for(int i = 0; i <= k - n; i++) {
			double temp = 0;
			for(int j = i; j < n + i; j++) {
				 temp += (1 + numList.get(j)) / 2;
			}
			
			if(ans < temp) {
				ans = temp;
			}
		}

		System.out.println(ans);
		sc.close();
	}

}