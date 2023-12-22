import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 1;
		
		while(true) {
			if((count*2)%N==0 && (count*2)%2==0) {
				System.out.println(2*count);
				break;
			}
			count++;
		}
		

	}

}
