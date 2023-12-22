import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			sum += Math.min(2 * a, (K - a) * 2);
		}
		System.out.println(sum);
	}
}