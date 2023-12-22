import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int res = sc.nextInt();
		
		int n = 4;
		int digit[] = new int[n];
		int cnt = 0;
		
		while(res > 0) {
			digit[cnt] = res % 10;
			res /= 10;
			cnt += 1;
		}
		
		if((digit[0] == digit[1] && digit[1] == digit[2] 
				|| (digit[1] == digit[2] && digit[2] == digit[3]))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}