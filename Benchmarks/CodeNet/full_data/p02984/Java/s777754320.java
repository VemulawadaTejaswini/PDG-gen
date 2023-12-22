import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		List<Long> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			list.add(a);
		}
		List<Long> hypoMountResult = new ArrayList<>();
		
		long lastDam = list.get(n-1);
		long maxA1 = list.get(0)+ lastDam;

		for (long tmpA1 = 0; tmpA1 <= maxA1; tmpA1 = tmpA1+2) {
			List<Long> hypoMount = new ArrayList<>();
			hypoMount.add(tmpA1);
			for (int i = 0; i < n-1; i++) {
				long prevMount = hypoMount.get(i);
				long dam = list.get(i);
				long nextMount = (dam - prevMount/2) * 2;
				if(nextMount <0){
					break;
				}
				hypoMount.add(nextMount);
			}
			// System.out.println("hypoMount "+hypoMount);

			if(hypoMount.size() != n){
				continue;
			}
			long lastCheck = hypoMount.get(n-1)/2 + tmpA1/2;
			// System.out.println("lastCheck "+lastCheck);
			if(lastCheck != lastDam){
				continue;
			}
			hypoMountResult = hypoMount;
			break;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(hypoMountResult.get(i));
			System.out.print(" ");
		}

	}

}
