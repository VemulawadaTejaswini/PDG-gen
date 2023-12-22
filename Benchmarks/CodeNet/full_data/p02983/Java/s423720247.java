import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int L = sc.nextInt();
		int R = sc.nextInt();
		int tmp = L * R;
		int wari = 2019;
		int ans;
		int ans_result = L * R;
		
		while(true) {
				
				ans = tmp % wari;
				
				if(ans <= ans_result) {
					ans_result = ans;
					if(tmp == ans_result) {
						break;
					}
				}
				wari = ans;
			
		}
		
		System.out.println(ans_result);
		
		
	}

}