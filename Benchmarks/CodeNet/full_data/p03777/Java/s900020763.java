import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		String aString = sc.next();
		String bString = sc.next();

		if(aString.charAt(0) == 'H'){
			if(bString.charAt(0) == 'H'){
				System.out.println("H");
			}else{
				System.out.println("D");

			}
		}else{
			if(bString.charAt(0) == 'H'){
				System.out.println("D");
			}else{
				System.out.println("H");

			}
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


