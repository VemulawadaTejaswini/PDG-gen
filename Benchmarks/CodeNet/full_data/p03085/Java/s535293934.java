import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String cc = sc.next();
		if(cc.charAt(0) == 'A'){
			System.out.print('T');
		}else if(cc.charAt(0) == 'T'){
			System.out.print('A');

		}else if(cc.charAt(0) == 'G'){
			System.out.print('C');

		}else{
			System.out.print('G');
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


