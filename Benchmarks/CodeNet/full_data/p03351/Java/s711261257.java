import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	//A
	public static void main(String[] args){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(b+c-2*a>2d)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
