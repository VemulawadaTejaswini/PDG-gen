import java.util.Scanner;

class Main{

	static char[][] map;
	static int N;
	static int M;
	static boolean flag;
	static int ans;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		N = sc.nextInt();
		M = sc.nextInt();
		map  = new char[100][100];

		for(int i = 0;i < 100;i++){
			for(int j = 0;j <100;j++){
				if(j < 50){
					map[i][j] = '.';
				}else{
					map[i][j] = '#';
				}
			}
		}
		int count = 0;
		int num = 1;

		for(int i = 0;num < N;i= i+2){
			if(99-(i+1) < 50){
				count = count+2;
				i = 0;
			}
			map[count+1][99-(i+1)] ='.';
			num++;

		}

		count = 0;
		num = 1;
		for(int i = 0;num < M;i = i+2){
			if(i+1 >= 50){
				count = count+2;
				i = 0;
			}
			map[count+1][i+1] ='#';
			num++;

		}

		System.out.println("100 100");
		for(int i = 0;i <100;i++){
			for(int j = 0;j<100;j++){
				System.out.print(map[i][j]);
			}
			System.out.println();

		}




	}


}

class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



