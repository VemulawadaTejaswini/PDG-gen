import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int price = b;
		if(a <13){
			price = b / 2;
		}
		if(a < 6){
			price = 0;
		}
		System.out.println(price);
	}
	
}
