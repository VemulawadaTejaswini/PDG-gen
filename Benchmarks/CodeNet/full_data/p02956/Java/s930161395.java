import java.util.*;
import java.util.stream.*;

/**
 * 136-F Enclosed Points
 *
 * 考え方(9/12)
 * 集合Sの各点 p に対し、「何回重複してカウントされるか」を考える。
 * 総和 sum の中で点 p の寄与分(重複カウント分)は以下の通り考えられる。
 * (1) p が含まれる集合 T でカウントされる場合
 * (2) p が含まれない集合 T でカウントされる場合
 *
 * つねに T がすべての部分集合を渡ることに注意。
 * 
 * (1)での寄与分は、p が含まれる集合 T の場合の数であり、2^(N-1)
 * (2)での寄与分を考える。
 *   p がカウントされるためには、長方形領域の中に p がいればよい
 *   そのような集合 T の場合の数が寄与分である。
 *
 *   長方形領域の中に p がいる、とはどのような場合か。
 *           |
 *       1   |   2
 *           |
 *   --------p---------
 *           |
 *       3   |   4
 *           |
 *   上で、p のまわりに T が広がっている場合である。
 *   この逆(p がはじっこにあって長方形領域から外れる場合)は、
 *   (1,2)にしか T の元がない場合
 *   (1,3)にしか T の元がない場合
 *   (2,4)にしか T の元がない場合
 *   (3,4)にしか T の元がない場合
 *   これらの場合の数で重複してカウントしている場合、つまり
 *   (1)にしか T の元がない場合～(4)にしか T の元がない場合
 *   を引くと場合の数が出る。これを全体の場合の数から引けばよい。
 *   この場合の数は、Xi, Yi をそれぞれ小さい順に 0, 1, 2, ... ,N と番号を
 *   振りなおすと数えやすくなる。
 *   全体の場合の数は 2^(N-1)-1 (-1 とするのは、空集合を除くため)
 *   p=(xi, yi) とした場合、
 *   (1,2)にしか T の元がない場合 2^yi-1 (-1 は空集合を除くため)
 *   (1,3)                        2^xi-1
 *   (2,4)                        2^(N-1-xi)-1
 *   (3,4)                        2^(N-1-yi)-1
 *   同様に
 *   (1)にしか T の元がない場合 (1) にある点の数を a1 とすると、2^a1-1
 *   a1 は逐次カウントするが、xi が小さいものから順に yi を(昇順)挿入リストに
 *   入れていくと、リストに入れた index が a1 になる。
 *
 *   上のアルゴリズムで総和 sum は以下のようになる。
 *   sum = (N-4)(2^N-1)+ sigma(i=0,1, ... ,N-1, 2^(a1i)+2^(a2i)+2^(a3i)+2^(a4i))
 *
 * 例題コピー用
 *   (1) 3 -1 3 2 1 3 -2 (答え13)
 *   (2) 4 1 4 2 1 3 3 4 2 (答え34)
 *   (3) 10 19 -11 -3 -12 5 3 3 -15 8 -14 -9 -20 10 -9 0 2 -7 17 6 -6 (答え7222)
 */
public class Make {
	Scanner sc;
	final int MOD = 998244353;
	int N;
	int[][] p;
	int[] pow2;
	
	int[] ylist;
	int ylistSize;
	
//=============
// constructor
//
	public Make() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	/**
	 * アルゴリズム本体
	 */
	private void calc() {
		N = sc.nextInt();
		p = new int[N][2]; // xpos:[][0], ypos:[][1]
		for (int i = 0; i < N; i++) {
			p[i][0] = sc.nextInt();
			p[i][1] = sc.nextInt();
		}
		// 2 のべきのテーブル pow2[i] = 2^i mod MOD
		pow2 = new int[N+1]; // 
		pow2[0] = 1;
		for (int i = 1; i < N+1; i++)
			pow2[i] = (pow2[i-1]*2)%MOD;
		// 既出 y 座標 の昇順リスト
		ylist = new int[N];
		ylistSize = 0;
		
		// 番号付け替え(ypos)
		Arrays.sort(p, (a,b) -> Integer.compare(a[1], b[1]));
		for (int i = 0; i < N; i++) p[i][1] = i;
		// 番号付け替え(xpos)
		Arrays.sort(p, (a,b) -> Integer.compare(a[0], b[0]));
		for (int i = 0; i < N; i++) p[i][0] = i;
		
		// 各点ごとに数値を計上していく
		int sum = (int) (((long)N-4)*(pow2[N]-1)%MOD);
		
		// 既出 y 座標 の昇順リスト
		for (int i = 0; i < N; i++) {
			if (i == N/2) ylistSize = 0;
			boolean former = (i < N/2);
			int j = (former)?i:N-1+N/2-i;
			
			// yi が p[i][1] の直前となる index を探す
			int yi = insertYPos(p[j][1]);
			//
			int a1 = yi;
			// a12 = p[j][1]
			int a2 = p[j][1] - a1;
			// a13 = p[j][0]
			int a3 = (former)?p[j][0] - a1 : p[j][0] - a2;
			// a34 = N-1-p[j][1]
			int a4 = N-1-p[j][1] - a3;
			
			int s = (pow2[a1] + pow2[a2])%MOD;
			s = (s + pow2[a3])%MOD;
			s = (s + pow2[a4])%MOD;
			sum = (sum + s)%MOD;
		}
		
		out(sum);
	}
	
	/**
	 * バイナリサーチにより、
	 * 指定された y 座標が list のどこに挿入されるべきか検索/挿入し、
	 * 挿入した index を返します。
	 */
	private int insertYPos(int y) {
		int yi = -1;
		int l = -1;
		int r = ylistSize;
		while (true) {
			yi = (l+r+2)/2-1;
			if (l == yi) break;
			if (ylist[yi] > y) r = yi;
			else l = yi;
		}
		if (yi < ylistSize) yi++;
		// yi の位置に値 y を挿入する。
		System.arraycopy(ylist, yi, ylist, yi+1, ylistSize - yi);
		ylist[yi] = y;
		ylistSize++;
		//list.add(yi, y);
		return yi;
	}
	
	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
//======
// main
//
	public static void main(String[] args) {
		Make m = new Make();
		m.calc();
	}

}