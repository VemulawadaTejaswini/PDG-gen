import java.util.Scanner;


class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int ans = X-A;
		while(true){
			ans -= B;
			if(ans < 0){
				ans += B;
				break;				

			}
		}
		System.out.println(ans);





	}
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

