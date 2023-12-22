import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	int N;
	int Y;
	public void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Y = sc.nextInt();
		int a=-1;
		int b=-1;
		int c=-1;
		boolean hit = false;
		for(int i=0; i<=N; i++) {
			for(int j=0; j<=N-i; j++) {
				if(1000*i + 5000*j + 10000*(N-i-j) == Y) {
					a=i;
					b=j;
					c=N-i-j;
					hit = true;
				}
			}
			if(hit)break;
		}
		System.out.println(c+" "+b+ " "+a);
		sc.close();
	}


}