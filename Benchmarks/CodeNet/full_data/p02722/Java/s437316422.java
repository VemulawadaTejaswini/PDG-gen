import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static long numFactor(long N){
		long ret = 1;
		List<Integer> factors = new ArrayList<Integer>();
		for(long i = 2 ; i * i <= N ; ++i){
			int f = 0;
			while(N % i == 0){
				N = N / i;
				++f;
			}
			if(f > 0){
				factors.add(f);
			}
		}
		if(N != 1){
			factors.add(1);
		}
		for(int f : factors){
			ret = ret * (long)(f + 1);
		}
		return ret - 1;
	}
	static long rec(List<Long> primes, List<Integer> factors , int cur , long val , long N){
		if(cur == primes.size()){
			if(val == 1){
				return 0;
			}
			while(N % val == 0){
				N = N / val;
			}
			if(N == 1){
				return 1;
			}
			if(val > N){
				return 0;
			}
			N = N - val * (N / val);
			if(N == 1){
				return 1;
			}
			return 0;
		}
		int F = factors.get(cur);
		long P = primes.get(cur);
		long pi = 1;
		long ret = 0;
		for(int i = 0 ; i < F ; ++i){
			ret += rec(primes, factors , cur + 1 , pi * val , N);
			pi = pi * P;
		}
		ret += rec(primes, factors , cur + 1 , pi * val , N);
		return ret;
	}
	static long calc(List<Long> primes, List<Integer> factors, long N){
		return rec(primes , factors , 0 , 1 , N);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ret = numFactor(N - 1);
		long originalN = N;
		List<Long> primes = new ArrayList<Long>();
		List<Integer> factors = new ArrayList<Integer>();
		for(long i = 2 ; i * i <= N ; ++i){
			int f = 0;
			while(N % i == 0){
				N = N / i;
				++f;
			}
			if(f > 0){
				primes.add(i);
				factors.add(f);
			}			
		}
		if(N != 1){
			primes.add(N);
			factors.add(1);
		}
		ret += calc(primes , factors, originalN);
		System.out.println(ret);
	}
}
