import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		

		int a = sc.nextInt();
		int p = sc.nextInt();
		
		System.out.println((a*3+p)/2);
		

		
		
	}
	
	static void allsum(int[] A){
		long ans = 0;
		for(int i = 0;i < A.length;i++){
//			System.out.println(A[i]);
			ans += A[i];
		}
		System.out.print(ans);
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

		return  otherpair.end - end;
	}
}


