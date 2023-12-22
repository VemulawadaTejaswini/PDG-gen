package test;

class Main {
	// Javaのmainメソッドの基本形
	public static void main(String[] args) {
		//0≤N,M≤100
		//2≤N+M
		int n;
		int N = 0,M = 0;
		int i = 0;
		int sumN = 0;
		int sumM = 0;
		int sum;
		if (N>1) {
			for(i=1;i<N;i++) {
				sumN += i;
			}
		}else {
			sumN = 0;
		}

		if (M>1) {
			for(i=0;i<M;i++) {
				sumM += i;
			}
		}else {
			sumN = 0;
		}
		sum = sumN + sumM;
	}
}