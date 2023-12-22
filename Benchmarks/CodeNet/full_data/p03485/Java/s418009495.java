import java.util.Scanner;

class Main{

	static int[] p;
	static	int N ;
	static	int M ;


	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();

		int ans = 0;
		if((N+M) %2 == 1){
			System.out.println((N+M)/2+1);
			return;

		}

		System.out.println((N+M)/2);

	}


}

class Pair implements Comparable{
	int from;
	int middle;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



