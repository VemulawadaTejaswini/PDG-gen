import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] C =new int[N];
		int[] S = new int[N];
		int[] F = new int[N];

		for(int i = 0;i < N-1;i++){
			C[i] = scanner.nextInt();
			S[i] = scanner.nextInt();
			F[i] = scanner.nextInt();
		}

		int[] data = new int[N];
		int count = 0;
		for(int i = 0;i < N;i++){
			count = i;
			data[i] += C[count] + S[count];

			while(count< N-2){
				while(data[i] % F[count+1] != 0 || data[i] < S[count+1]){
					data[i]++;
				}
				count++;
				data[i] += C[count] ;

			}
		}
		
		for(int i = 0;i < N;i++){
			System.out.println(data[i]);
		}






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

