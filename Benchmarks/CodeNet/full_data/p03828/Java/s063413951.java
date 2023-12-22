import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long ans=1;

		int mod=100000000+7;

		Map<Integer,Integer> primecounter=new TreeMap<Integer,Integer>();


		for (int i = N; i>0; i--) {

			for(Entry<Integer, Integer> E:primefactor(i).entrySet()) {

				Integer key=E.getKey();
				Integer value=E.getValue();

				if(primecounter.containsKey(key)){
					primecounter.put(key,primecounter.get(key)+value);
				}else {
					primecounter.put(key, value);
				}
			}

		}

		for(Entry<Integer, Integer> E:primecounter.entrySet()) {
			ans=ans*(E.getValue()+1)%mod;
		}
		System.out.println(ans);

	}

	//以下テンプレート

	public static String numtoalpha(int i) {

		String alpha = "abcdefghijklmnopqrstuvwxyz";

		return alpha.substring(i, i + 1);

	}

	public static Map<Integer,Integer> primefactor(int n){

		Map<Integer,Integer> res = new TreeMap<Integer,Integer>();

		for (int i = 2; i*i <= n; i++) {

			//因数が見つかったら、割れなくなるまで割って記録。
			while(n%i==0) {

				if(res.containsKey(i)) {
					res.put(i,res.get(i)+1);
				}else {
					res.put(i,1);
				}

				n/=i;

			}

		}

		//素数のパターン、最後まで試さないとわからない。
		if(n != 1) res.put(n,1);

		return res;

	}

	public static int[] extgcd(int a, int b) {

		int x0 = 1;
		int x1 = 0;

		int y0 = 0;
		int y1 = 1;

		while (b != 0) {
			int q = a / b;
			int r = a % b;

			int x2 = x0 - q * x1;
			int y2 = y0 - q * y1;

			a = b;
			b = r;

			x0 = x1;
			x1 = x2;

			y0 = y1;
			y1 = y2;
		}

		return new int[] { a, x0, y0 };

	}

	static int gcd(int a, int b) {

		if (b == 0)
			return a;

		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}

		return gcd(b, a % b);

	}

	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	static void swap(int[] a) {
		int t;

		t = a[0];
		a[0] = a[1];
		a[1] = t;

		return;
	}

	static <T> void output(List<T> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));

			if (i != list.size() - 1) {
				System.out.print(" ");
			} else {
				nl();
			}
		}

	}

	static void output(String[][] str) {

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				print(str[i][j]);
			}

			nl();
		}

	}

	static void output(boolean flg, String Yes, String No) {

		if (flg) {
			pln(Yes);
		} else {
			pln(No);
		}

	}

	static void output(String[][] str, int digit) {

		String dig = "%" + String.valueOf(digit) + "s";

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.printf(dig, str[i][j]);
			}
			nl();
		}

	}

	static void pln(String str) {
		System.out.println(str);
	}

	static void pln(int x) {
		System.out.println(x);
	}

	static void print(String str) {
		System.out.print(str);
	}

	static void print(int x) {
		System.out.print(x);
	}

	static void print(String str, int times) {
		for (int i = 0; i < times; i++) {
			print(str);
		}
	}

	static void print(int x, int times) {
		for (int i = 0; i < times; i++) {
			print(x);
		}
	}

	static void nl() {
		System.out.println();
	}

}
