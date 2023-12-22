import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力


		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sub = c;
		for(int i = 0;i < 10;i++){
			sub = a*sub - b;
			System.out.println(sub);
		}

	}


	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}





}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}


