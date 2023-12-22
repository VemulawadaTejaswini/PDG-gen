import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

class Main{
	static int G;
	static int D;
	static int[] p;
	static int[] c;
	static boolean[] used;
	static long ans = 1000000000;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0;i < n;i++){
			a[i] = sc.nextLong()-(i+1);
		}
		Arrays.sort(a);

		TreeMap<Long, Long> syutugen = new TreeMap<Long, Long>();
		for(int i = 0;i < n;i++){
			syutugen.put(a[i], 1l);
		}
		ArrayList<Long> list = new ArrayList<Long>();
		for(long i:syutugen.keySet()){
			list.add(i);
		}

		long min = a[0];
		long max = a[n-1];

		long ans = 0;
		for(int i = 0;i < n;i++){
			ans += Math.abs(a[i] - min);
		}

//		System.out.println("ans "+ans);
		int p = 0;
		int plus = 0;
		int minus = n;
		while(a[0] == a[p]){
			plus++;
			minus--;
			p++;
			if(p >= n){
				break;
			}
		}
		
		

		for(long i = min+1;i <= max;i++){
//			System.out.println("plus "+plus);
//			System.out.println("minus "+minus);

			long sum = ans;
			sum = sum + (plus -minus);
			if(ans <= sum){
				System.out.println(ans);
				return;
			}


			if(i == a[p]){
				while(i == a[p]){
					plus++;
					minus--;
					p++;
					if(p >= n){
						break;
					}
				}
			}
			ans = sum;
//			System.out.println("sum "+sum);
		}

		System.out.println(ans);




	}


}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

