import java.util.*;
public class Main {
	
	public static int[] S;
	public static int m7 = (int) (Math.pow(10, 9) + 7);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		ArrayList<Long> set = new ArrayList<Long>();
		long min = Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			long s = sc.nextLong();
			if (min > s) min = s;
			set.add(s);
		}
		Collections.shuffle(set);

		System.out.println(func(N,set,min,X));
	}
	
	// index iと　最小値 minと割る数 Xを受け取る　X%iが最小値よりも小さいならば、 X%i*(N-i-1)!を返す
	// そうでない場合は、 i以降の数字jに対して再起した結果の和を返す
	public static long func(int N, ArrayList<Long> set, long min, long X) {
		if (set.size()==1) return X%set.get(0);
		long ret = 0;
		for(int idx = 0;idx<set.size();idx++) {
			if(X%set.get(idx)==min) return 0;
			if(X%set.get(idx)<min) {
				long cret = X%set.get(idx);
				for(int i=set.size()-1;i>0;i--) {
					cret = (cret * i) % m7;
					//System.out.println(cret);
				}
				ret = (ret + cret) % m7;
			}
			else {//X%set.get(idx)よりも大きいものでは悪い見ない
				ArrayList<Long> nset = new ArrayList(set);
				long s = X%set.get(idx);
				long cret = 1;
				long org = nset.size();
				nset.remove(idx);
				for(int i=0;i<nset.size();i++) {
					if(s < nset.get(i)) {
						cret = (cret*nset.size()) % m7;
						nset.remove(i);
						i--;
					}
				}
				
				ret = (ret + ((func(N,nset,min,X%set.get(idx))*cret)%m7)) % m7;
			}
		}
		
		return ret%m7;
	}
}
