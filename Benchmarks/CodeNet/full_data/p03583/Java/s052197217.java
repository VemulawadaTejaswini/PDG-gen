import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		int h = 0, n2 = 0, w = 0;
		for(int i = 1; i <= 3500; ++i) {
			for(int j = 1; j <= 3500; ++j) {
				long tmp = (long)i * (long)j * (long)n;
				long tmp2 = (long)4 * (long)i * (long)j - (long)j * (long)n - (long)i * (long)n;
				if(tmp2 <= 0)continue;
				if(tmp % tmp2 == 0) {
					h = i;
					n2 = j;
					w = (int)(tmp / tmp2);
				}
			}
		}
		System.out.println(h + " " + n2 + " " + w);
	}

}
