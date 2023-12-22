import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		long resultSum =0;
		List<Long> aList = new ArrayList<>(n+1);
		List<Long> bList = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(sc.next());
			aList.add(a);
		}
		aList.add(Long.parseLong(sc.next()));

		for (int i = 0; i < n; i++) {
			long b = Long.parseLong(sc.next());
			bList.add(b);
			resultSum += b;
		}


		// System.out.println("aList " + aList);

		// System.out.println("bList " + bList);

		long prevAmari  = aList.get(n);
		for (int i = n-1; i >= 0 ; i--) {
			// System.out.println("i " + i);

			long b = bList.get(i);
			long ai = aList.get(i);
			long bPower = b;
			if(prevAmari>=0){
				if(bPower>=prevAmari){
					bPower = bPower - prevAmari;
				}else{
					bPower = 0;
				}
			}

			if(bPower >= ai){
				prevAmari =0;
				resultSum -= bPower-ai;
			}else{
				prevAmari = ai - bPower;
			}
			// System.out.println("b " + b);
			// System.out.println("ai " + ai);

			// System.out.println("prevAmari " + prevAmari);
			// System.out.println("bPower " + bPower);
			// System.out.println("resultSum " + resultSum);
		}
		System.out.println(resultSum);


	}

}
