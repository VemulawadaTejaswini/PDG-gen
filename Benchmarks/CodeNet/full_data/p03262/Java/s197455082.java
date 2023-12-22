import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		ArrayList<Integer> x = new ArrayList<>();
		for(int i = 0;i < N;++i)
			x.add(sc.nextInt());
		sc.close();
		
		if(N == 1) {
			System.out.println(Math.abs(X - x.get(0)));
		}else {
		
		
			x.add(X);
			int[] x2 = new int[N];
			for(int i = 0;i < N;++i)
				x2[i] = x.get(i);
			Arrays.sort(x2);
			
			int[] sub = new int[N-1];
			for(int i = 0;i < N-1;++i)
				sub[i] = x2[i+1] - x2[i];
			Arrays.sort(sub);
			
			int gcd = 0;
			for(int i = sub[0];i >= 1;--i) {
				boolean flag = true;
				for(int j = 0;j < N-1;++j) {
					if(sub[j] % i != 0) {
						flag = false;
						break;
					}
				}
				if(flag) {
					gcd = i;
					break;
				}
			}
			
			System.out.println(gcd);
		}
	}
}
