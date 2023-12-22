import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		for(int i = 0;i <= 25;i++){
			for(int j = 0;j <= 15;j++){
				if(4*i+7*j == n){
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");

		
	
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

