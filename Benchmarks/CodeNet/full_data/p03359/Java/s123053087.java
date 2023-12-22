import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner stdIn = new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		
	if(b>=a){
		System.out.println(a);
	}
	else
		System.out.println(a-1);
	}

}
