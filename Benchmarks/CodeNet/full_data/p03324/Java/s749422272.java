import java.util.Scanner;

class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int ans;
		sc.close();
		if(D==0) {
			ans = N;			
		}
		else {
			int tmp = 1;
			for(int i=0;i<D;i++) {
				tmp *=100;
			}
			ans = tmp*N;
		}
		System.out.println(ans);
	}
}