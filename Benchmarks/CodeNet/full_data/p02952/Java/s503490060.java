import java.util.Scanner;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num < 10){
			System.out.println(num);
		} else if(num >= 10 && num <= 99){
			System.out.println(9);
		} else if(num >= 100 && num <= 999){
			System.out.println(9 + (num - 99));
		} else if(num >= 1000 && num <= 9999){
			System.out.println(909);
		} else if(num >= 10000 && num <= 99999){
			System.out.println(909 + (num - 9999));
		} else if(num == 100000){
			System.out.println(90909);
		}
		
	}
}