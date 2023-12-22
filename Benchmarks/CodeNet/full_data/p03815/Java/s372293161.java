import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int number = scan.next();
		
		int count=1;
		if (number<=6){
			System.out.print(1);
		}
		
		while(number>6){
			number = number-6;
			count++;
		}
		System.out.print(count);
		

	}

}
