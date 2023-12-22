import java.util.Arrays;
import java.util.Scanner;


class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] L = new int[2000000];
		int[] R = new int[2000000];
		int[] D = new int[2000000];
		int[] data = new int[2000000];
		boolean[] flag = new boolean[2000000];
		Arrays.fill(flag, false);


		for(int i = 1; i < M+1 ;i++){
			L[i] = scan.nextInt();
			R[i] = scan.nextInt();
			D[i] = scan.nextInt();
		}
		data[L[1]] = 0;
		flag[L[1]] = true;

		for(int i = 1; i < M+1 ;i++){

			if(flag[R[i]] == true && data[R[i]] != L[i] +D[i]){					//すでに条件があり、条件と異なる場合

				System.out.println("No");
				return;
			}else{														//条件なし、つまり初めて訪れる時
				data[R[i]] =L[i] + D[i];
				flag[R[i]] = true;

			}
		}
		System.out.println("Yes");

	}


	class Pair implements Comparable{
		int from;
		int end;

		public Pair(int a,int b) {
			this.from = a;
			this.end = b;

		}
		@Override
		public int compareTo(Object other) {
			Pair otherpair = (Pair)other;

			return end - otherpair.end;
		}
	}
}

