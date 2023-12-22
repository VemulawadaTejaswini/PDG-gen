import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.omg.CORBA.portable.InputStream;

class Main{


	public static void main(String[] args) {
		FastScanner sc = new FastScanner();			//文字の入力
		int n = sc.nextInt();


		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0;i < n;i++){
			b[i] = sc.nextInt();
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (b[i] > max) {
				max = b[i];
			}
		}
		int maxBits = Integer.toBinaryString(max).length();


		long ans = 0;
		for(int i = 0;i <= maxBits;i++){
			long mod = 1 << (i+1);
			mod--;
			//			System.out.println(i+"bit目");

			long[] ar = new long[n];
			long[] br = new long[n];
			for(int k = 0;k < n;k++){
				ar[k] = a[k]  &mod;
				br[k] = b[k] &mod; 					//iビット目について調べたい時、それ以降のビット情報は無駄なので省く
			}
			Arrays.sort(br);
			long T = 1 << i;
			long count = 0;
			for(int j = 0;j < n;j++){
				int sub = 0;
				int left = lowerbond(T-ar[j],br);
				int right = lowerbond(2*T-ar[j],br);
				//				System.out.println("left "+left+" right "+right);
				count += right-left;
				count %= 2;
				left = lowerbond(3*T-ar[j],br);
				right = lowerbond(4*T-ar[j],br);
				//				System.out.println("left "+left+" right "+right);
				count += right-left;
				count %= 2;
				//				System.out.println("sub "+sub);
			}

			//	System.out.println("count "+count);
			if(count % 2 == 1){
				ans |= 1 << i;
			}

		}
		System.out.println(ans);
	}


	static int lowerbond(long k, long[] data){		//kより小さい最小の値をdataの中から探し、返す二分探索
		int min = 0;
		int max = data.length-1;

		while(max-min >= 0){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid-1;
			}else{
				min = mid+1;
			}
		}
		return min;
	}

}

class FastScanner {
	private final InputStream in = (InputStream) System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	public boolean hasNext() { skipUnprintable(); return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public int nextInt() {
        if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return  minus ? (int)-n : (int)n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
	
	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}







class UnionFind{
	int[] parent;
	public UnionFind(int N){
		this.parent = new int[N];
		for(int i = 0; i < N;i++){
			parent[i] = i;
		}
	}
	public int root(int x){			//根要素を取得
		if(parent[x] == x){			//初期状態
			return x;
		}else{
			return parent[x] = root(parent[x]);    	//再帰によって根を取得
		}
	}
	public void unite(int x,int y){ 	//統合メソッド
		if(same(x,y)){					//同じ根なら終了
			return;
		}
		int xroot = root(x);
		int yroot = root(y);
		parent[xroot] = yroot;			//統合
		return;

	}

	public boolean same(int x,int y){			//根が同じか（同じグループに属しているか）を判定
		return(root(x) == root(y));
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

