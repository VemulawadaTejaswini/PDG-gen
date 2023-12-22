import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int bb = 0;
		int cc = 0;
		bb = a - b;
		cc = a - c;
		if(bb < 0){
			bb = -1*bb;
		}
		if(cc < 0){
			cc = -1*cc;
		}
		if(bb < cc){
			System.out.println(bb);
		}else if(bb > cc){
			System.out.println(cc);
		}
		
	}
}