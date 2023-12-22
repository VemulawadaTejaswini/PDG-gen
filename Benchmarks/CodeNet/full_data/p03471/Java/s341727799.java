import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Y = scan.nextInt();
		
		for(int x=0;x<=N;x++) {
			for(int y=0;y<=N-x;y++) {
				int total = x*10000 + y*5000 + 1000*(N-x-y);
				if(total==Y) {
					System.out.println(x+" "+y+" "+(N-x-y));
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}