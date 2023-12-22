import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> fact = new HashMap<>();
		for(int i = 2; i <= N; i++)
			fact.put(i, 0);
		for(int i = 2; i <= N; i++) {
			int x = i;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(x % j == 0) {
					int n = 0;
					while(x % j == 0) {
						x /= j;
						n++;
					}
					fact.put(j, fact.get(j)+n);
				}
			}
			if(x > 1)
				fact.put(x, fact.get(x)+1);
		}
		int sf = 0, tf = 0, ft = 0, f = 0, t = 0;
		for(int i : fact.values()) {
			if(i >= 74)
				sf++;
			if(i >= 24)
				tf++;
			if(i >= 14)
				ft++;
			if(i >= 4)
				f++;
			if(i >= 2)
				t++;
		}
		System.out.println(sf+tf*(t-1)+ft*(f-1)+f*(f-1)/2*(t-2));
	}

}