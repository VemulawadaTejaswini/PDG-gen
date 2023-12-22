import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		long x = sc.nextLong();
		Map<Long, Long> patie = new HashMap<>();
		Map<Long, Long> amount = new HashMap<>();

		patie.put(0l,1l);
		amount.put(0l,1l);
		for(long i=0l;i<n;i++){
			long curPatie = patie.get(i)*2l +1l;
			long curAmount = amount.get(i) * 2l +3l;
			patie.put(i+1l,curPatie);
			amount.put(i+1l,curAmount);
		}

		

		System.out.println(x);
	}


	// private  long calcTotal( long n,long remainEat) {
	// 	if(n == 0){
	// 		return 5;
	// 	}
	// 	return 3 + calcTotal(n-1)*2;
	// }


}