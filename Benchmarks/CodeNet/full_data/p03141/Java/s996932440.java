import java.util.Arrays;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long[] A = new long[n];
		long[] B = new long[n];
		for(int i = 0;i < n;i++){
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		long sum[] = new long[n];
		long ans = 0l;
		for(int i = 0;i < n;i++){
			sum[i] = A[i] + B[i];
			ans -= B[i];
		}

		Arrays.sort(sum);
		for(int i = n-1;i >= 0;i -= 2){
			ans += sum[i];
		}
		
		System.out.println(ans);



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

		return end - otherpair.end;
	}
}

