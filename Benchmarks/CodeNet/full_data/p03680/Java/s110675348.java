import java.util.Scanner;
import java.util.Random;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int n = sc.nextInt();
		int a = rand.nextInt(n) + 1;
		
		if(a == 2) {
			System.out.println(1);
			return;
		}
		
		int i = 1;
		while(a != 2) {
			a = rand.nextInt(n) + 1;
			i++;
		}
		System.out.println(i);
	}
}