import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
		c-=a-b;
		if(c<0){
			c=0;
		}
		System.out.println(c);
	}
}