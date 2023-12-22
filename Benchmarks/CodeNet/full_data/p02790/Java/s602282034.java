import java.math.*;
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		long v1=0,v2=0;
		for(int i=0;i<b;++i)v1=v1*10+a;
		for(int i=0;i<a;++i)v2=v2*10+b;
		String[] ans= {String.valueOf(v1),String.valueOf(v2)};
		Arrays.sort(ans);
		System.out.println(ans[0]);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
