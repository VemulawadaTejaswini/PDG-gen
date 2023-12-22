import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;
	static long pow = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		long n =sc.nextLong();
		long m =sc.nextLong();

		if(n >= m/2){
			System.out.println(m/2);
		}else{
			long ans = 0;
			ans += n;
			m -= n*2;
			ans += m/4;
			System.out.println(ans);
		}
		
		
	}
	
	
	
}

class Pair implements Comparable{
	Character from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


