import java.util.Scanner;

class Main{
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		int ans = 0;
		for(int i = 1000000;i >= 1;i--){
			if(M % i == 0 && (M / i) >= N ){
				ans = Math.max(ans, i);
				
			}
			
		}
		System.out.println(ans);
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

