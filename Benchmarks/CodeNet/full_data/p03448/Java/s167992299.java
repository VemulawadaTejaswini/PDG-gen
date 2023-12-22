import java.util.Scanner;


class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int X = scan.nextInt();

		int ans = 0;

		for(int i = 0;i<= A;i++){
			for(int j= 0;j <= B;j++){
				for(int m = 0;m <= C;m++){
					ans += count(i,j,m,X);
							
				}
			}
		}



		System.out.println(ans);

	}
	
	static int count(int a,int b,int c,int X){
		if(X == a*500+b*100+c*50){
			return 1;
		}else{
			return 0;
		}
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

