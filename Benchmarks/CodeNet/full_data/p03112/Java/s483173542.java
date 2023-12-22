import java.util.Scanner;

public class Main {
	
	// 近い場所を探す
	public int searchNearIndex(long[] ABi, long point) {
		int left = 0;
		int right = ABi.length-1;
		
		while(true) {
			//System.out.println(left + ", " + right);
			if (left >= right - 1) {
				if (Math.abs(ABi[left] - point) > Math.abs(ABi[right] - point)) {
					//System.out.println("near" + right);
					return right;
				} else {
					//System.out.println("near" + left);
					return left;
				}
			}
			
			int index = (left + right) / 2;
			if (ABi[index] == point) {
				return index;
			} else if (ABi[index] < point) {
				right = index;
			} else {
				left = index;
			}
		}
	}
	
	public long sub2(long[] Ai, long[] Bi, long[] Anext, long[] Bnext, long point) {
		// first is Ai
		int firstIndex = searchNearIndex(Ai, point);
		long diff = Ai[firstIndex] - point;
		long next = Anext[firstIndex];
		
		if (diff * next < 0) {	// 逆方向
			if (Math.abs(diff) > Math.abs(next)) {
				return Math.abs(diff);
			}
		}
		return Math.abs(diff) + Math.abs(next);
	}
	
	public long sub(long[] Ai, long[] Bi, long[] Anext, long[] Bnext, long point) {
		long firstA = sub2(Ai, Bi, Anext, Bnext, point);
		long firstB = sub2(Bi, Ai, Bnext, Anext, point);
		
		if (firstA < firstB) {
			return firstA;
		} else {
			return firstB;
		}
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int Q = in.nextInt();
		
		long[] Ai = new long[A];
		long[] Bi = new long[B];
		long[] Qi = new long[Q];
		
		for (int i=0; i<A; i++) {
			Ai[i] = in.nextLong();
		}
		for (int i=0; i<B; i++) {
			Bi[i] = in.nextLong();
		}
		for (int i=0; i<Q; i++) {
			Qi[i] = in.nextLong();
		}
		in.close();
		
		// 各寺・神舎から最も近い反対の建物までの距離を覚える（東が正）
		long[] Anext = new long[A];
		long[] Bnext = new long[B];
		
		int index = 0;
		for (int i=0; i<A; i++) {
			Anext[i] = Bi[index] - Ai[i];
			if (index < B-1) {
				if (Math.abs(Anext[i]) > Math.abs(Bi[index+1] - Ai[i])) {
					index++;
					i--;
				}
			}
		}
		
		index = 0;
		for (int i=0; i<B; i++) {
			Bnext[i] = Ai[index] - Bi[i];
			if (index < A-1) {
				if (Math.abs(Bnext[i]) > Math.abs(Ai[index+1] - Bi[i])) {
					index++;
					i--;
				}
			}
		}
		
		for (int i=0; i<Q; i++) {
			long ret = sub(Ai, Bi, Anext, Bnext, Qi[i]);
			System.out.println(ret);
		}
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}
