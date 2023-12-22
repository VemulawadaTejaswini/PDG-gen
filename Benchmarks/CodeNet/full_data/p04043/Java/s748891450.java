import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int sum5 = 0;
		int sum7 = 0;
		
		if(A == 5) {
			sum5++;
		} else if(A == 7) {
			sum7++;
		}
		if(B == 5) {
			sum5++;
		} else if(B == 7) {
			sum7++;
		}
		if(C == 5) {
			sum5++;
		} else if(C == 7) {
			sum7++;
		}
		
		if(sum5 == 2 && sum7 == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		scan.close();
	}

}
