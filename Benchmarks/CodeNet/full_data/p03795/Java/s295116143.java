import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int num = a/15;
		
		System.out.println(800*a - num*200);
	}
}