import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int[]numA = new int[n];
		
		boolean exist_odd = false;
		
		for(int i=0; i< n; i++) {
			numA[i] = kb.nextInt();
			if(numA[i]%2 == 1)
				exist_odd = true;
		}
		if(exist_odd == true) 
			System.out.println(0);
		else {
			int min = Integer.MAX_VALUE;
			for(int i=0; i< n; i++) {
				int ans = 0;
				while(numA[i] %2 == 0) { 
					numA[i] /= 2;
					ans++;
				}
				min = Math.min(min, ans);
			}
			System.out.println(min);
		}
		kb.close();
	}
}