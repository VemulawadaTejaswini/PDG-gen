import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	if(a > b){
		System.out.println("GREATER");
	}else if(a < b){
		System.out.println("LESS");

	}else{
		System.out.println("EQUAL");

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


