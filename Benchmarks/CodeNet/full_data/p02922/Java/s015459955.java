import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int cnt = 1;
		if(a>=b) {
			System.out.println(1);
		}else {
			cnt += (b-2)/(a-1);
			System.out.println(cnt);
		}
		
		
		
	}

}
