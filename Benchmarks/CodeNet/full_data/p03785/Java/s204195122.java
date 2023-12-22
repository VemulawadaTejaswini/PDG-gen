package GrandContest011A;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1行目の入力
		int N = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		//2行目以降の入力
		int[] T = new int[N];
		for(int i=0; i<N; i++){
			T[i]  = sc.nextInt();
		}
		//T[i]を並び替える
		int[ ] temp = new int[T.length] ;
		for(int intvl = 1; intvl <= T.length; intvl *= 2) {
			for(int s1 = 0; s1 < T.length; s1 += intvl * 2) {
				int e1 = Math.min(s1 + intvl, T.length) ;
				int s2 = e1 ;
				int e2 = Math.min(s2 + intvl, T.length) ;
				int i = s1 ;
				int j = s2 ;
				int k = s1 ;
				while( i < e1 && j < e2 ) {
					if( T[i] < T[j] ) {
						temp[k++] = T[i++] ;
					} else {
						temp[k++] = T[j++] ;
					}
				}
				while( i < e1 ) { temp[k++] = T[i++]; }
				while( j < e2 ) { temp[k++] = T[j++]; }
				System.arraycopy( temp, s1, T, s1, k - s1 );
			}
		}
		//バスの数をカウントする
		int count = 1;
		int firstPassenger = 0;
		for(int i=0; i<N; i++){
			if(i-firstPassenger==C || T[i]>T[firstPassenger]+K){
				count++;
				firstPassenger = i;
			}
		}
		//出力
		System.out.println(count);

	}

}
