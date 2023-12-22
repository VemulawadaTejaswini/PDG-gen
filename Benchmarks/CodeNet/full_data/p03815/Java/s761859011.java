import java.util.Scanner;

class Main{




	public static void main(String[] args) {





		Scanner sc = new Scanner(System.in);			//文字の入力
		long x = sc.nextLong();

		long a = x/11;
		int b = 0;
		
		
		if(x % 11 == 0){
			b = 0;
		}else if(x%11 <= 6){
			b=1;
		}else{
			b = 2;
		}
		System.out.println(a*2+b);

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


