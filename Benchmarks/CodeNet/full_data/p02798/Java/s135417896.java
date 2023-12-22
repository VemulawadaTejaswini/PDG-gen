import java.util.*;

public class Main{
	public static void main(String[] args){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][] a=new int[2][n];
		for(int i=0;i<n;++i)
			a[i%2][i]=s.nextInt();
		for(int i=0;i<n;++i)
			a[i%2^1][i]=s.nextInt();

		System.err.println(Arrays.toString(a[0]));
		System.err.println(Arrays.toString(a[1]));
		System.err.println();

		int r=Integer.MAX_VALUE;
		loop:
		for(int[]p:new Permutation(n)) {
			for(int i=0;i<n-1;++i) {
				if(a[i%2][p[i]]>a[i%2^1][p[i+1]])
					continue loop;
			}
			System.err.println(Arrays.toString(p));
			r=Math.min(r,inv(Arrays.copyOf(p,n)));
		}
		System.out.println(r==Integer.MAX_VALUE?-1:r);
	}

	private static void swap(int[] a,int i){
		int t=a[i];
		a[i]=a[i+1];
		a[i+1]=t;
	}

	static int inv(int[]a) {
		int r=0,n=a.length;
		for(int i=0;i<n;++i) {
			for(int j=n-1;j>i;--j) {
				if(a[j-1]>a[j]) {
					swap(a,j-1);
					++r;
				}
			}
		}
		return r;
	}
}


class Permutation implements Iterable<int[]>{
	private final int size;

	/**
	 * <p>
	 * 順列を表すクラスのコンストラクタ。反復子が返す配列の要素数を指定する。
	 * @param size
	 * 順列の要素数（10程度が妥当な最大値）
	 * @throws IllegalArgumentException
	 * 引数（順列の要素数）が0以下の場合
	 */
	public Permutation(int size){
		if(size<=0) throw new IllegalArgumentException();
		this.size=size;
	}

	@Override
	public Iterator<int[]> iterator(){
		return new Iter(size);
	}

	private class Iter implements Iterator<int[]>{
		private final int[]	source;
		private boolean		isFirst	=true;

		private Iter(int size){
			source=new int[size];
			for(int i=0;i<size;++i){
				source[i]=i;
			}
		}

		/**
		 * <p>
		 * 反復子がまだ順列を返しうるか調べる。
		 * 本メソッドは{@link Iter#next()}呼び出し前に必ず1回ずつ実行する必要がある。
		 * @return 順列が存在する場合はtrue
		 */
		@Override
		public boolean hasNext(){
			if(isFirst){
				isFirst=false;
				return true;
			}

			int n=source.length;
			for(int i=n-1;i>0;i--){
				if(source[i-1]<source[i]){
					int j=n;
					while(source[i-1]>=source[--j])
						;
					swap(source,i-1,j);
					reverse(source,i,n);
					return true;
				}
			}
			reverse(source,0,n);
			return false;
		}

		/**
		 * <p>
		 * 次の順列を表すint型配列を返す。
		 * <p>
		 * このメソッドが返す参照は常に同じ配列に対する参照である。
		 * このため配列の要素を変更したり次回の{@link Iter#next()}呼び出し後も参照する場合は、
		 * クラスの呼び出し側が配列のクローンを生成して利用する必要がある。
		 * @return 順列を表すint型配列
		 */
		@Override
		public int[] next(){
			return source;
		}

		@Override
		public void remove(){
			throw new UnsupportedOperationException();
		}

		private void swap(int[] is,int i,int j){
			int t=is[i];
			is[i]=is[j];
			is[j]=t;
		}

		private void reverse(int[] is,int s,int t){
			while(s<--t)
				swap(is,s++,t);
		}
	}
}
