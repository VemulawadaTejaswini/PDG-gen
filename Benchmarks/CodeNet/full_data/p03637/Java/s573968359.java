import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		int twoCount = 0;
		int not4 = 0;
		for (int i = 0; i < N; i++) {
			int val = sc.nextInt();
			if (val % 4 == 0) {
				count++;
			} else if (val == 2) {
				twoCount++;
			} else {
				not4++;
			}
		}
		
		String ans = (not4 + twoCount % 2) <= count ? "Yes" : "No"; 
		System.out.println(ans);
	}
}