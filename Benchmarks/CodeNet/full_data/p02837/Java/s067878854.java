import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] isHonest = new boolean[15];

		int n = sc.nextInt();
		for(int i = 0; i<n; i++){
			isHonest[i] = true;
		}

		boolean[][][] testimony = new boolean[15][15][2];

		for(int i =0; i < n; i++){

			for(int j = 0; j < n; j++){


				testimony[i][j][0] = false;
				testimony[i][j][1] = false;
			}
		}

		for(int i =0; i < n; i++){
			int a = sc.nextInt();
			for(int j = 0; j < a; j++){
				int x = sc.nextInt()-1;
				int y = sc.nextInt();

				testimony[i][x][y] = true;
			}
		}


		int count = 0;
		int max = 1<<n;

		for(int num = 0; num < max; num++) {
			if(canConsist(num,n,testimony) ){
				int tmp = Integer.bitCount(num);
				if(tmp > count){
					count =tmp;
				}
			}



		}
		System.out.print(count);



	}
	static boolean canConsist(int num,int n,boolean[][][] testimony){
		boolean canConsist = true;

		for(int i = 0; i < n;i++){
			for(int j =0; j <n; j++){
				if(((num>>i ^ (num>>j)&1)==1) && testimony[i][j][1]){
					return false;
				}
				if ((num>>i &num>>j&1)==1 && testimony[i][j][0]) {
					return false;

				}


			}
		}
		return true;

	}


}