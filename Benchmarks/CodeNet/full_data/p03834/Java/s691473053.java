import java.util.Scanner;

class Main{

	static	int[] data;




	public static void main(String[] args) {





		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		StringBuilder sb = new StringBuilder(string);
		for(int i = 0;i < string.length();i++){
			if(sb.charAt(i) == ','){
				sb.setCharAt(i, ' ');
			}
		}
		string = new String(sb);
		System.out.println(string);



	}



	static void num(int n){


		int num = n;
		for(int i = 1;i <= n;i++){
			if(n % i == 0){
				data[i]++;
				n /= i;
				i = 1;
			}
		}
		return;

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


