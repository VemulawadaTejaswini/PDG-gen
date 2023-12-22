import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		int twoCount = 0;
		for (int i = 0; i < N; i++) {
			int val = sc.nextInt();
			count += val % 4 == 0 ? 1 : 0;
			if (val == 2)
				twoCount++;
			
			if (twoCount == 2) {
				twoCount = 0;
				count++;
			}
		}
		
		String ans = N / 2 <= count ? "Yes" : "No"; 
		System.out.println(ans);
	}
}