import java.util.Scanner;

class Main{
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int T = scanner.nextInt();
		int[] c = new int[N] ;
		int[] t = new int[N] ;


		for(int i = 0;i < N;i++){
			c[i] =  scanner.nextInt();
			t[i] =  scanner.nextInt();

		}
		int ans = 100000;
		for(int i= 0;i < N;i++){
			if(t[i] <= T){
			ans = 	Math.min(ans, c[i]);
			}
		}
		if(ans == 100000){
			System.out.println("TLE");
		}else{
		System.out.println(ans);


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

