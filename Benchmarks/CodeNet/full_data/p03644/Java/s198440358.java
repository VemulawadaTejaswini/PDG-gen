import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
//------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxCount =0;
		int ans = 1;
		sc.close();

		for (int i=1 ; i <= N ; i++) {
			int count = 0;
			int currentNumber = i;
			while (true) {
				if(currentNumber % 2 ==0) {
					count++;
					currentNumber /= 2;
				} else {
					break;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				ans = i;
			}
		}
		System.out.println(ans);


//------------------------------------------------------------
	}
}
