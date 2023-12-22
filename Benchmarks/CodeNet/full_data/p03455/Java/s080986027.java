import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt(),num2 = sc.nextInt();
			String Result = "";
			if(num1 * num2 % 2 == 0){
				Result = "Even";
			}else if(num1 * num2 % 2 != 0){
				Result = "Odd";
			}
			System.out.println(Result);
			sc.close();
		}
}