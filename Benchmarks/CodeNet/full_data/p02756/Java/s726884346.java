import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int Q = sc.nextInt();
		boolean r = false;
		for (int i = 0; i < Q; i++) {
			int T = sc.nextInt();
			if (T == 1) {
				r = !r;
			} else {
				int F = sc.nextInt();
				if ((F == 1&&r==false)||(F==2&&r==true)) {
					S = sc.next() + S;
				} else {
					S = S + sc.next();
				}
			}
		}
		sc.close();
		if(r==true) {
	         StringBuffer str = new StringBuffer(S);
	         S = str.reverse().toString();
		}
		System.out.println(S);
	}
}
