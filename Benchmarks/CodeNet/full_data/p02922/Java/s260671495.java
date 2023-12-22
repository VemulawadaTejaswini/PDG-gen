import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		int total = 1;
		sc.close();
		while (true) {
			total--;
			total += a;
			count++;
			if(total >= b){
				break;
			}
		}
System.out.println(count);
	}
}