import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		boolean flg = true;
		for(int i=N-1;i>=1;i--) {
			if(flg==false) {
				break;
			}
			for(int j=i-1;j>=0;j--) {
				if(H[i]+2<=H[j]) {
					flg = false;
				}
			}
		}
		if(flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
