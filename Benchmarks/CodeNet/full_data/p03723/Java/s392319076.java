import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
		if(a == b && b == c && c == a && a % 2 == 0)
			System.out.println(-1);
		else{
			int count = 0;
			while(a % 2 == 0 && b % 2 == 0 && c % 2 == 0){
				int temp_a = b / 2 + c / 2;
				int temp_b = c / 2 + a / 2;
				c = a / 2 + b / 2;
				a = temp_a;
				b = temp_b;
				count++;
			}
			System.out.println(count);
		}
	}
 
}