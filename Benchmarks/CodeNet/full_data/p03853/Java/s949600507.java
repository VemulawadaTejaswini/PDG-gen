import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int H = stdIn.nextInt();
		int W = stdIn.nextInt();
		stdIn.nextLine();
		String[] C = new String[H];
		for(int i=0;i<H;i++){
			C[i] = stdIn.nextLine();
		}
		for(String Ci :C){
			System.out.println(Ci);
			System.out.println(Ci);
		}
	}
}
