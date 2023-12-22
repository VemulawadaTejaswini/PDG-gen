import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int total = 0;
		if(a>b) {
			total+=a;
			if(a-1>b)total+=a-1;
			else total+=b;
		}
		else{
			total+=b;
			if(b-1>a)total+=b-1;
			else total+=a;
		}
		
		System.out.println(total);
	}		
}