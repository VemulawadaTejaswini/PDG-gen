import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println((a < 9 && b < 9) ? "Yay!": ":(");
	}
}
