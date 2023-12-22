import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int M=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int x_max=-1001;
		int y_max=1001;
		for(int i=0; i<N; i++) {
			x_max=Math.max(x_max, sc.nextInt());
		}
		for(int i=0; i<M; i++) {
			y_max=Math.min(y_max, sc.nextInt());
		}


		for(int i=X+1; i<=Y; i++) {
			if(x_max<i && y_max>=i) {
				System.out.println("No War");
				System.exit(0);
			}
		}

		System.out.println("War");

	}
}