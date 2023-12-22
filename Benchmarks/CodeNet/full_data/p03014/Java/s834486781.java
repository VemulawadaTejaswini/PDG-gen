import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static int ans;
	static int[] parent;//union-find用
	static int[] rank;//union-find用

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] s= new String[H];

		for(int i = 0;i<H ; i++) {
			s[i]=sc.next();
		}


		int[][] left = new int[H][W];
		int[][] right = new int[H][W];
		int[][] up = new int[H][W];
		int[][] down = new int[H][W];

		for(int h = 0;h<H ; h++) {
			for(int w = 0;w<W ; w++) {
				if(s[h].charAt(w)=='#') {
					left[h][w] = 0;
				}else if(w==0) {
					left[h][w]=1;
				}else{
					left[h][w]=left[h][w-1]+1;
				}
			}
		}

		for(int h = 0;h<H ; h++) {
			for(int w = W-1;w>=0 ; w--) {
				if(s[h].charAt(w)=='#') {
					right[h][w] = 0;
				}else if(w==W-1) {
					right[h][w]=1;
				}else  {
					right[h][w]=right[h][w+1]+1;
				}
			}
		}

		for(int h = 0;h<H ; h++) {
			for(int w = 0;w<W ; w++) {
			 if(s[h].charAt(w)=='#') {
					up[h][w] = 0;
				}else if(h==0) {
					up[h][w]=1;
				}else{
					up[h][w]=up[h-1][w]+1;
				}
			}
		}

		for(int h = H-1;h>=0 ; h--) {
			for(int w = 0;w<W ; w++) {
				if(s[h].charAt(w)=='#') {
					down[h][w] = 0;
				}else if(h==H-1) {
					down[h][w]=1;
				}else {
					down[h][w]=down[h+1][w]+1;
				}
			}
		}

		ans = 0;

		for(int h = 0;h<H ; h++) {
			for(int w = 0;w<W ; w++) {
				int tmpAns = right[h][w] + left[h][w] + up[h][w] + down[h][w] -3;
				ans = Integer.max(ans , tmpAns);
			}
		}

		System.out.println(ans);
	}

	//素数判定
	public static boolean isPrime(long num) {
		if (num < 2) return false;
		else if (num == 2) return true;
		else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

		double sqrtNum = Math.sqrt(num);
		for (int i = 3; i <= sqrtNum; i += 2)
		{
			if (num % i == 0)
			{
				// 素数ではない
				return false;
			}
		}

		// 素数である
		return true;
	}

	//BFS用に二つの配列を足し算する
	static int[] addArrayElms(int[] a, int[] b) {
		int[] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

	//	//二分探索
	//k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray){
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedArray[mid]<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//二分探索
	//k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList){
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedList.get(mid)<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
		return b == 0 ? a: gcd(b, a % b);
	}
	public static long gcd(long a, long b) {
		return b == 0 ? a: gcd(b, a % b);
	}

	//Union-Find用の配列を要素数nで初期化
	static void ufInit(int n){
		parent = new int[n];
		rank = new int[n];
	}

	//Union-Findの要素の最上位の親（グループ名）を返す
	static int ufFind(int a) {
		if(parent[a]==a) {
			return a;
		}else {
			return ufFind(parent[a]);
		}
	}

	//Union-Find木を連結する
	static void ufUnite(int a, int b) {
		a = parent[a];
		b = parent[b];

		if(a==b) {
			return;
		}
		if(rank[a] > rank[b]){
			parent[b]=a;
		}else {
			parent[a]=b;
			if(rank[a]==rank[b]) {
				rank[b]++;
			}
		}
	}

	static boolean ufSame(int a, int b) {
		return ufFind(a)==ufFind(b);
	}
}
