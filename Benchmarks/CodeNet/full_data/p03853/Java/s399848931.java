import java.util.Scanner;

class Main{




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		for(int i = 0;i < h;i++){
			String string = sc.next();
			System.out.println(string);
			System.out.println(string);
			
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


