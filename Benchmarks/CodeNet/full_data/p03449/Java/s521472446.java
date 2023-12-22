import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String A1 = sc.nextLine();
		String A2 = sc.nextLine();
		sc.close();
		int max = 0;
		
		int[][] A = new int[2][N];
		
		for(int j = 0; j < N; j++) {
			String[] s1 = A1.split(" ");
			String[] s2 = A2.split(" ");
			A[0][j] = Integer.valueOf(s1[j]);
			A[1][j] = Integer.valueOf(s2[j]);
		}
		
		for(int j = 0; j < N; j++) {
			max = Math.max(max, candies(j, A));
		}
		System.out.println(max);
	}
	
	public static int candies(int down,int A[][]) {
		int count = 0;
		for(int i = 0; i <= down; i++) {
			count += A[0][i];
		}
		for(int i = down; i < A[0].length; i++) {
			count += A[1][i];
		}
		return count;
	}
}