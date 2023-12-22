import java.util.Scanner;

class Main{




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		
		String string = sc.next();
		if(string.charAt(0) == 'a' || string.charAt(0) == 'e' || string.charAt(0) == 'i' || string.charAt(0) == 'o' || string.charAt(0) == 'u'){
			System.out.println("vowel");
		}else{
			System.out.println("constant");
		}
		
		


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


