
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int sum = 0;
		int max = 0;
		
		for(int p = 1 ; p <= N ; p++) {
			p = stdIn.nextInt();
			if (max < p) max = p;		
			sum += p;
		}
		
		int X = sum - (max /2);
		System.out.println(X);
		

	}



	}


