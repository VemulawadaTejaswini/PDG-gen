import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		if(Math.abs(x-y)%x==0) {
			System.out.println(-1);
		}else {
			System.out.println(x);
		}
		
		
	}

}
