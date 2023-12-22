import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		if(a + 2*Math.sqrt(a)*Math.sqrt(b) + b < c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
