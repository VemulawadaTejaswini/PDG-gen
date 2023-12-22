import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);	
		int X = io.nextInt();
		int Y = io.nextInt();
		
		System.out.println((Math.abs(X-Y)<=2)?"Brown"
											: "Alice");
	}
}