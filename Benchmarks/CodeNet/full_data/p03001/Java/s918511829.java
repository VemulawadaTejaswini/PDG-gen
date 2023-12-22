import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		String s = "";
		if(W==H && x==y && W/2==x) {
			s = "1";
		}else {
			s = "0";
		}
		
		double face = W*H/2;
		
		System.out.println(face + " " + s);
		
		sc.close();
	}

}