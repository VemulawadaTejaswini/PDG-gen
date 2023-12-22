import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		
		int hp;
		int count;
		
		for(count = 1 ; count <= 10000 ; count++ ) {
			hp = num1 - num2*count;
			if(hp <= 0) break;
		}
				System.out.println(count);
			
		}
	}
