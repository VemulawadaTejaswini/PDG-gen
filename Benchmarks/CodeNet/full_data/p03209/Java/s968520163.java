

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	/* 後日解説みながら */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long X = scan.nextLong();
		scan.close();

		List<Long> a = new ArrayList<>();
		List<Long> p = new ArrayList<>();

		for(int i=0; i<N; i++) {
			a.add(count(i));
			p.add(countP(i));
		}
		System.out.println(f(N, X, p, a));
	}

	public static long f(int N, long X, List<Long> p, List<Long> a) {
		if(N==0) {
			if(X<=0) {
				return 0;
			} else {
				return 1;
			}
		} else if(X<=1+a.get(N-1)) {
			return f(N-1, X-1, p, a);
		} else {
			return p.get(N-1)  + 1 + f(N-1, X-2-a.get(N-1), p, a);
		}
	}

	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long X = scan.nextLong();
		scan.close();

		//System.out.println(count(N));
		//System.out.println(countP(N));
		//System.out.println(fullL(countP(N)));

		long eatP=0;
		long eatAll = 0;
		int eatLevel = 0;

		if(X<=N) {
			System.out.println(0);
			return;
		}

		while(true) {
			eatLevel = fullL(X);
			eatP+= countP(eatLevel);
			eatAll+= count(eatLevel);
			if(eatLevel==0) {
				break;
			}
			if(count(eatLevel)<X-2) {
				eatP++;
				eatAll+=2;
			}
			X = X - eatAll;

		}

		System.out.println(eatP);





		//System.out.println(countPX(N,X));

	}

	private static long countPX(int N, int X) {
		return 0;
	}

	//指定された層までに完全に含まれるバーガーのレベルを返す
	public static int fullL(long sou) {
		int L=0;
		for(int i=1; i<=50; i++) {
			if(count(i)<=sou) {
				L++;
			} else {
				break;
			}
		}
		return L;
	}

	//層の数を返す
	public static long count(int N) {
		if(N==0) return 1;
		return(count(N-1)*2+3);
	}

	//Pの数を返す
	public static long countP(int N) {
		if(N==0) return 1;
		return(countP(N-1)*2+1);
	}
}
