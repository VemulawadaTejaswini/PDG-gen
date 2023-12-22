
import java.util.Scanner;

class Point{
	int[] x;
	Point(int[] a){
	this.x = a;
	}

}


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] S = new int[M][N+1];

		for(int i = 0 ; i < M ; i ++){
			int k = sc.nextInt();
			for(int j = 0 ; j < k ; j++){
				S[i][j] = sc.nextInt();
			}
		}

		int[] P = new int[M];
		for(int i = 0 ; i < M ; i++){
			P[i] = sc.nextInt();
		}


		sc.close();

		int aans = (int)Math.pow(2, N);
		String denkyu;
		String ar = "%0" + N + "d";

		int count = 0;
		int a = 0;
		int ans = 0;
		for(int i = 0 ; i < aans ; i++){
			denkyu = String.format(ar ,Integer.parseInt(Integer.toBinaryString(i)));
			//System.out.println(denkyu);



			for(int j = 0 ; j < M ; j++){
				for(int k = 0 ; k < N ; k++){
					if(S[j][k] ==0){
						break;
					}
					//System.out.println("S : " + S[j][k]);
					a += Integer.parseInt(String.valueOf(denkyu).substring(S[j][k]-1,S[j][k]));

					}
				//System.out.println("a : " + a);
				if(a%2 == P[j]){
					count++;
				}
				a = 0;
			}
			//System.out.println(count);
			if(count == M){
				ans++;
			}
			count = 0;
		}
		System.out.println(ans);
	}

}