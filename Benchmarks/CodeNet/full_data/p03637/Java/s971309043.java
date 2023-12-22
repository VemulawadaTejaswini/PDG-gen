import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a;
		int nCnt = 0;
		int n2Cnt = 0;
		int n4Cnt = 0;
		boolean judge = false;

		for (int i=0; i<N; i++){
			a = sc.nextInt();
			if (a % 4 == 0){
				n4Cnt++;
			} else if (a % 2 == 0){
				n2Cnt++;
			} else {
				nCnt++;
			}
		}

		if (nCnt == 0) {
			judge = true;
		} else {
			if (nCnt <= n4Cnt){
				judge = true;
			} else if (nCnt +1 == n4Cnt){
				if (n2Cnt == 0){
					judge = true;
				}
			}
		}

		if (judge){
			System.out.println("Yes");
		} else {
			System.out.println("No!");
		}

	}

}
