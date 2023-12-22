import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		run();
	}
	static void run(){
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		String a[][] = new String[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				a[i][j] = scan.next();
			}
		}
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.print(a[i][j]);
				System.out.println("");
				System.out.print(a[i][j]);
			}
		}
	}
}