import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] A= {
				{1,2,3,4,5,6,7,8,9,10,11,12},{1,3,1,2,1,2,1,1,2,1,2,1}
		}
		;

		int aa=sc.nextInt();
		int bb=sc.nextInt();

		if(A[1][aa-1]==A[1][bb-1]) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}