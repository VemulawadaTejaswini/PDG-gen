import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		int r = in.nextInt(), g = in.nextInt(), b = in.nextInt();
		if((r * 100 + g *10 + b) % 4 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	

}
