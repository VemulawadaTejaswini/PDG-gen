import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = Math.min(a, b);
		int min =(Math.max(a, b) + Math.min(a, b)) - n;
		if(min < 0){
			min = 0;
		}
		System.out.println(max+" "+min);
		

		

		
	}
	
}



class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

