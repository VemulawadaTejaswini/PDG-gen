import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		String x = sc.next();
		String y = sc.next();
		String z = sc.next();

		System.out.print(Character.toUpperCase(x.charAt(0)));	
		System.out.print(Character.toUpperCase(y.charAt(0)));		
		System.out.print(Character.toUpperCase(z.charAt(0)));		

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


