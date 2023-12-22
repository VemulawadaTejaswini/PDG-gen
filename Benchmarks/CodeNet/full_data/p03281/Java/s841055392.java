import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N= sc.nextInt();
		int ans = 0;
		for(int i = 1;i <= N;i= i+2){
			int count = 0;
			for(int j = 1;j <= N;j++){
				if(i%j == 0){
					count++;
				}
			}
			if(count == 8){
				ans++;
			}
		}
			System.out.println(ans);
		
	
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

