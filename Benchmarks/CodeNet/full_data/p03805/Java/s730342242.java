
import java.util.Arrays;
import java.util.Scanner;

class Point{
	int x;
	int y;
	int z;
	Point(int a,int b,int c){
		this.x = a;
		this.y = b;
		this.z = c;
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] S = new int[M][2];

		for(int i = 0 ; i < M ; i++){
			S[i][0] = sc.nextInt();
			S[i][1] = sc.nextInt();
		}

		sc.close();

		int n = (int)Math.pow(2, M);

		String ar = "%0" + M + "d";
		String aa;

		int[][] ans = new int[2][M];
		for(int i = 0 ; i < M ; i++){
			ans[0][i] = i+1;
		}

		int answer = 0;
		for(int i = 0 ; i < n ; i++){
			aa = String.format(ar,Integer.parseInt(Integer.toBinaryString(i)));
			//System.out.println(aa);
			for(int j = 0 ; j < M ; j++){
				if(aa.substring(j, j+1).equals("1")){
					ans[1][S[j][0]-1] ++ ;
					ans[1][S[j][1]-1] ++ ;
					//System.out.println(S[j][0] - 1);
				}
			}

			int count = 0 ;
			int onecount = 0;
			int twocount = 0;

			for(int k = 0 ; k < M ; k++){
				count += ans[1][k];
				if(ans[1][k] == 1){
					onecount++;
				}
				if(ans[1][k] == 2){
					twocount++;
				}
			}

			if(count != N*2-2 || onecount != 2 || twocount != N-2){
				for(int[]  x : ans){
					Arrays.fill(x, 0);
				}
			}
			else{
				/*
				System.out.println(aa);
				for(int l = 0 ; l < M ; l++){
					System.out.println(ans[1][l]);
				}
				*/
				answer++;
			}
		}
		System.out.println(answer);

	}

}