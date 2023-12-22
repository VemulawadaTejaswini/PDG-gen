import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<N;i++) {
			int p = sc.nextInt();
			if(i+1!=p) {
				cnt++;
			}
		}
		if(cnt<=2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
