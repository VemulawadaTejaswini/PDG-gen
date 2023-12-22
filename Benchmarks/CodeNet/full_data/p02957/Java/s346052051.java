import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		long num1 = Long.parseLong(line[0]);
		long num2 = Long.parseLong(line[1]);

		if(num1%2 == num2%2) {
			long num3 = num1 + num2 ;
			System.out.println(num3/2);
		}else {
			System.out.println("IMPOSSIBLE");
		}
}

}