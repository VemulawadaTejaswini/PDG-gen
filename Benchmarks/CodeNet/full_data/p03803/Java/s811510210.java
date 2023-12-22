import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int alice=sc.nextInt();
	private static int bob=sc.nextInt();
	public static void main(String[] args){
		if(alice==1) alice=14;
		if(bob==1) bob=14;
		if(alice>bob){
			System.out.println("Alice");
		}
		else if(bob>alice){
			System.out.println("Bob");
		}else{
			System.out.println("Draw");
		}
	}
}