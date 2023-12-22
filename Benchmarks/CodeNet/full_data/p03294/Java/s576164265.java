import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		int[][] data = {{1,11},{5,3}};
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[]a = new int[N];
		int sum = 1;
		for(int i = 0;i < N;i++){
			a[i] = scan.nextInt();
			sum *= a[i];
		}
		int max = 0;
		for(int i= 0;i < N;i++){
			max = Math.max(max, a[i]);
		}

		int ans = Integer.MAX_VALUE;
		for(int j = 0;j < max;j++ ){
			int subans = 0;
			for(int i= 0;i < N;i++){
				subans += (sum-j)%a[i];
			}
			
			ans = Math.min(ans, subans);
		}

		System.out.println(ans);







		//		String S = scan.next();

		//		int[] data = new int[N];
		//		for(int i= 0; i < N ;i++){
		//			data[i] = scan.nextInt();
		//		}
		//
		//		int[][] mat = new int[N][N];
		//		int[][] xor = new int[N][N];
		//
		//		for(int i = 0;i < N;i++){
		//			mat[i][i] = data[i];
		//			for(int j = i; j < N-1;j++){
		//				mat[i][j+1] = mat[i][j]+ data[j+1];
		//
		//			}	
		//		}
		//		
		//		for(int i =0 ; i<N;i++){
		//			for(int j = 0;j < N;j++){
		//			System.out.print(mat[i][j]);
		//			System.out.print(" ");
		//
		//			}
		//			System.out.println();
		//
		//		}
		//		
		//
		//		for(int i = 0;i < N;i++){
		//			xor[i][i] = data[i];
		//			for(int j = i; j < N-1;j++){
		//				xor[i][j+1] +=xor[i][j] ^ data[j];
		//
		//			}	
		//		}
		//		
		//		for(int i =0 ; i<N;i++){
		//			for(int j = 0;j < N;j++){
		//			System.out.print(mat[i][j]);
		//			System.out.print(" ");
		//
		//			}
		//			System.out.println();
		//
		//		}
		//
		//		int count = 0;
		//		for(int i= 0;i < N;i++){
		//			for(int j = i;j < N;j++){
		//				if(xor[i][j] == mat[i][j]&&mat[i][j] != 0 ){
		//					count++;
		//				}
		//			}
		//		}
		//		System.out.println(count);
		//
		//


	}
}






