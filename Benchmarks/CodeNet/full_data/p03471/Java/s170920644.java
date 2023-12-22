import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n,num1,num2,num3;
		int cash;
		n = stdIn.nextInt();
		cash = stdIn.nextInt();

		num1 = cash/10000;
		cash = cash - num1*10000;		

		num2 = cash/5000;
		cash = cash - num2*5000; 
		 

		num3 = cash/1000;
		

		System.out.print(num1+" ");
		System.out.print(num2+" ");
		System.out.println(num3);

		
	}

}