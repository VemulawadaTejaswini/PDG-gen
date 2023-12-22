import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		long hole[][] = new long[n][3];
		for(int i=0;i<n;i++) {
			int x = fs.nextInt(), y = fs.nextInt();
			hole[i][0]=x;
			hole[i][1]=y;
			hole[i][2]=i;
		}
		
		double ans[] = new double[n];
		
		long[][] ls = convex_hull(hole);
		int m = ls.length;
		double pi = Math.PI;
		for(int i=0;i<m;i++) {
			long v1[] = vecSub(ls[(i+1)%m],ls[i]);
			long v2[] = vecSub(ls[(i+2)%m],ls[(i+1)%m]);
			double theta = pi - vecCorner(v1,v2);
			double p = (pi - theta)/(2*pi);
			int id = (int)ls[(i+1)%m][2];
			ans[id] = p;
		}
		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
	}
	//キャリパー法：凸包の直径（最遠点）を求める。引数は凸包
//使い方：convex_hullで求めた凸包をcaliperの引数にして実行。返り値が最遠点間距離
static double caliper(long ch[][]) {
	int n = ch.length;
	int i = 0, j = 0; //iをx軸方向に最小の頂点、jを最大の頂点とする。
	for (int k = 0; k < n; k++) {
		if (cmpX(ch[i], ch[k]) > 0)
			i = k;
		if (cmpX(ch[j], ch[k]) < 0)
			j = k;
	}
	double res = 0;
	int si = i, sj = j;
	while (i != sj || j != si) {
		res = Math.max(res, eDist(ch[i], ch[j]));
		if (outPro(vecSub(ch[(i + 1) % n], ch[i]), vecSub(ch[(j + 1) % n], ch[j])) < 0)
			i = (i + 1) % n;
		else
			j = (j + 1) % n;
	}
	return res;
}

//x, y 順の辞書順比較
static int cmpX(long p1[], long p2[]) {
	if (p1[0] == p2[0])
		return p1[1] - p2[1] < 0 ? -1 : 1;
	return p1[0] - p2[0] < 0 ? -1 : 1;
}

//凸包を求める
static long[][] convex_hull(long p[][]) {
	int n = p.length;
	Arrays.sort(p, (p1, p2) -> {
		if (p1[0] != p2[0])
			return p1[0] - p2[0] < 0 ? -1 : 1;
		return p1[1] - p2[1] < 0 ? -1 : 1;
	});
	long[][] ls = new long[n * 2][3];
	int k = 0;
	//下側凸包の作成
	for (int i = 0; i < n; i++) {
		while (k > 1 && outPro(vecSub(ls[k - 1], ls[k - 2]), vecSub(p[i], ls[k - 1])) <= 0)
			k--;
		ls[k++] = p[i];
		
	}
	//上側凸包の作成
	for (int i = n - 2, t = k; i >= 0; i--) {
		while (k > t && outPro(vecSub(ls[k - 1], ls[k - 2]), vecSub(p[i], ls[k - 1])) <= 0)
			k--;
		ls[k++] = p[i];
	}
	ls = Arrays.copyOfRange(ls, 0, k - 1);
	return ls;
}

//L2distance(Euclid)
static double eDist(long p1[], long p2[]) {
	double s = (p1[0] - p2[0]) * (p1[0] - p2[0]);
	double t = (p1[1] - p2[1]) * (p1[1] - p2[1]);
	return Math.sqrt(s + t);
}

//vectorCulculations

//ベクトル和： v1[] + v2[]
static long[] vecSum(long v1[], long v2[]) {
	long res[] = new long[2];
	res[0] = v1[0] + v2[0];
	res[1] = v1[1] + v2[1];
	return res;
}
//ベクトル差： v1[] - v2[]
static long[] vecSub(long v1[], long v2[]) {
	long res[] = new long[2];
	res[0] = v1[0] - v2[0];
	res[1] = v1[1] - v2[1];
	return res;
}

//内積(innerProduct)
static long inPro(long v1[], long v2[]) {
	return v1[0] * v2[0] + v1[1] * v2[1];
}

//外積(outerProduct): v1->v2の外積
static long outPro(long v1[], long v2[]) {
	return v1[0] * v2[1] - v1[1] * v2[0];
}

//２ベクトルの成す角
static double vecCorner(long v1[], long v2[]) {
	double cos = (double)inPro(v1,v2) / (vecLen(v1)*vecLen(v2));
	double theta = Math.acos(cos);
	return theta;
}

//ベクトルの長さ
static double vecLen(long v[]) {
	return Math.sqrt(v[0]*v[0] + v[1]*v[1]);
}


}



//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}