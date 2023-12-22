import java.util.HashMap;
import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		long n = sc.nextLong();
		long p = sc.nextLong();

		HashMap<Long, Long> insu = new HashMap<Long,Long>();
		long c = 2;
		if(p == 1){
			System.out.println(1);
			return;
		}
		if(n == 1){
			System.out.println(p);
			return;
		}
		
		while(true){				//素因数分解
			if(p == c){
				break;
			}

			if(p%c == 0){
				if(insu.get(c) != null){
					long nn = insu.get(c) + 1;
					insu.put(c, nn);
					p /= (long)c;
					c = 2;
				}else{
					long nn =   1;
					insu.put(c, nn);
					p /= (long)c;
					c = 2;
				}
			}else{

				c++;
			}
		}

		if(insu.get(c) != null){
			long nn = insu.get(c) + 1;
			insu.put(c, nn);
			p /= (long)c;
		}else{
			long nn =   1;
			insu.put(c, nn);
			p /= (long)c;
		}

//		for(int i:insu.keySet()){				//確認
//			System.out.println("素数 "+i + " 数 "+insu.get(i));
//		}		
//		System.out.println();




		for(long i:insu.keySet()){				//整理
			if(insu.get(i) >= 2*n){
				insu.put(i*i, insu.get(i)/2);
			}
		}

		long setnum = 0;
		for(long i:insu.keySet()){			
			setnum++;
		}

		long min = 1000000000;
		int keynum = 1;
		for(long i:insu.keySet()){				//数が3つ以上のを見つける
			min = Math.min(min, i);
			if(insu.get(i) >= setnum){
				keynum *= i;
			}
		}

		if(keynum!= 0){
			System.out.println(keynum);
		}else{
			System.out.println(min);

		}



	}


}

class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}
