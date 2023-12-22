import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] leftmax=new int[N];
		int[] rightmax=new int[N];
		int[] num=new int[N];
		leftmax[0]=0;
		rightmax[N-1]=0;
		for(int i=0; i<N; i++) {
			num[i]=sc.nextInt();
		}
		for(int i=1; i<N; i++) {
			leftmax[i]=Math.max(leftmax[i-1], num[i-1]);
		}
		for(int i=N-1; i>=1; i--) {
			rightmax[i-1]=Math.max(rightmax[i], num[i]);
		}
		for(int i=0; i<N; i++) {
			System.out.println(Math.max(leftmax[i], rightmax[i]));
		}
	}
}