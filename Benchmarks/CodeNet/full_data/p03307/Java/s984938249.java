import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count =1;
		
		while(true) {
			if(count%2==0 && count%N==0) {
				System.out.print(count);
				break;
			}
		}
		

	}

}