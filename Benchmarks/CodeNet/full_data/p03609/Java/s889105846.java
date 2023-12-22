import java.util.Scanner;

class Main{

	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int t = scanner.nextInt();
		int ans = N -t;
		if(ans  < 0){
			System.out.println(0);
		}else{
			System.out.println(N-t);
		
		}
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



