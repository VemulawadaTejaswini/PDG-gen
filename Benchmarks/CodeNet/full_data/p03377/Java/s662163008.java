import java.util.Scanner;

class Main{

	static char[][] map;
	static int N;
	static int M;
	static boolean flag;
	static int ans;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int A =sc.nextInt();
		int B = sc.nextInt();
		int X = sc.nextInt();


			if(X < A){
				System.out.println("NO");
			}else if(X > A+B){
				System.out.println("NO");

			}else{
				System.out.println("YES");

			}
			
		


	}


}

class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



