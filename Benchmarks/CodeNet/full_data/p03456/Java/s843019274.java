import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int num = Integer.parseInt(a + b);

		if(Double.compare(Math.sqrt(num), Math.floor(Math.sqrt(num))) == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
