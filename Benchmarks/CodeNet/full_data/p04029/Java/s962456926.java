
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numOfChildren = sc.nextInt();
		int sumOfCandy = 0;
		
		for(int i=1;i<=numOfChildren;i++){
			sumOfCandy +=i;
		}
		
		System.out.print(sumOfCandy);
	}
}