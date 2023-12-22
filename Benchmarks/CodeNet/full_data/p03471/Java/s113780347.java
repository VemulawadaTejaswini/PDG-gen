import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Y = scan.nextInt();
		int c = 0;
		
		for(int x=0;x<N;x++) {
			
			for(int y=0;y<N;y++) {
				if(0<c) {
					break;
				}
				for(int z=0;z<N;z++) {
					if(x+y+z==N && 10000*x + 5000*y + 1000*z ==Y) {
						System.out.println(x+" "+y+" "+z);
						c++;
					}
				}
			}
		}
		if(c==0) {
			System.out.println("-1 -1 -1");
		}
	}
}