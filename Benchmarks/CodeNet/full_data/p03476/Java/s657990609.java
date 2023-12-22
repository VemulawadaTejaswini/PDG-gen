import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A =new int[N];
		int[] B = new int[N];

		for(int i = 0;i < N;i++){
			A[i] = scanner.nextInt();
			B[i] = scanner.nextInt();
		}

		int[] ans = new int[N];
		for(int i = 0;i < N;i++){
			for(int j = A[i];j <= B[i];j++){
				if(judge(j) && judge((j+1)/2)){
					ans[i]++;
				}
			}
			System.out.println(ans[i]);


		}
		

	}


	static boolean judge(int d){
		if(d == 1){
			return false;
		}
		for(int i = 2;i <= d/2;i++){
			if(d % i == 0){
				return false;
			}
		}
		return true;
	}
}
class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

