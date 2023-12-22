import java.math.*;
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		System.out.println(N==M?"Yes":"No");
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
