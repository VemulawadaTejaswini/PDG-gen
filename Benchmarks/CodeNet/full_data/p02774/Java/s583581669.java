
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int bsearch(List<Long> ps , long x){
		if(ps.isEmpty()){
			return 0;
		}
		if(ps.get(0) >= x){
			return 0;
		}
		if(ps.get(ps.size() - 1) < x){
			return ps.size();
		}
		int left = 0;
		int right = ps.size() - 1;
		while(right - left > 1){
			int mid = (left + right) / 2;
			long v = ps.get(mid);
			if(v < x){
				left = mid;
			}else{
				right = mid;
			}
		}
		return right;
	}
	// x 以下の数値が何個あるか計算する (xはマイナスとする)
	static int f(List<Long> negs , List<Long> poss , long x){
		int ret = 0;
		for(long n : negs){ //n -3  x -81
			long m = (- x + (-n - 1)) /(- n);
			// x以下となるのは m が 26以上のとき
			int cnt = bsearch(poss, m);
			ret += poss.size() - cnt;
		}
		return ret;
	}
	static int g(List<Long> poss , long x){
		int ret = 0;
		int N = poss.size();
		for(int i = 0 ; i < poss.size() - 1; ++i){
			long pi = poss.get(i);
			long m = x / pi;
			int left = i + 1;
			int right = N - 1;
			if(poss.get(left) > m){
				continue;
			}
			// i + 1 , N - 1
			if(poss.get(right) <= m){
				ret += N - i - 1;
				continue;
			}
			while(right - left > 1){
				int mid = (left + right) / 2;
				if(poss.get(mid) <= m){
					left = mid;
				}else{
					right = mid;
				}
			}
			ret += (left) - i;			
		}
		return ret;
	}

	static long solveNaive(long A[] , int K){
		List<Long> lst = new ArrayList<Long>();
		int N = A.length;
		for(int i = 0 ; i < N ; ++i){
			for(int j = i +1 ; j < N ; ++j){
				lst.add(A[i] * A[j]);
			}
		}
		Collections.sort(lst);
		return lst.get(K - 1);
	}
	static long solve(long A[] , int K){
		List<Long> neg = new ArrayList<Long>();
		List<Long> neg2 = new ArrayList<Long>();
		List<Long> pos = new ArrayList<Long>();
		List<Long> zero = new ArrayList<Long>();
		for(long a : A){
			if(a < 0){
				neg.add(a);
				neg2.add(- a);
			}else if(a == 0){
				zero.add(a);
			}else{
				pos.add(a);
			}			
		}
		Collections.sort(neg);
		Collections.sort(neg2);
		Collections.sort(pos);
		Collections.sort(zero);
		int neg_num = neg.size() * pos.size();
		int zero_num = zero.size() * (pos.size() + neg.size()) + (zero.size() * (zero.size() - 1)) / 2;
		int pos_num = neg.size() * (neg.size() - 1) / 2 + pos.size() * (pos.size() - 1) / 2;
//		System.out.println(zero_num+" "+(zero_num+neg_num+pos_num));
		if(K > neg_num && K <= neg_num + zero_num){
			return 0;
		}else{
			if(K <= neg_num){
				long left = - (1000000000L * 1000000000L);
				long right = 0;
				while(right - left > 1){
					long mid = (left + right) / 2;
					int f = f(neg, pos , mid);
					if(K <= f){
						right = mid;
					}else{
						left = mid;
					}
				}
				return right;
			}else{
				long left = 0;
				long right = (1000000000L * 1000000000L);
				while(right - left > 1){
					long mid = (left + right) / 2;
					int f = g(neg2, mid) + g(pos , mid) + neg_num + zero_num;
					if(K <= f){
						right = mid;
					}else{
						left = mid;
					}
				}
				return right;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long A[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			long a = sc.nextLong();
			A[i] = a;
		}
		System.out.println(solve(A, K));
	}
}
