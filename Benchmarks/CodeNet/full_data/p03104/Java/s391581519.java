import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		long A = Long.parseLong(line[0]);
		long B = Long.parseLong(line[1]);
		
		long result = A;
		for (long i =A+1;i<=B;i++) {
			result ^= i;
		}
		
		System.out.println(result);
	}

}

class Shop{
	int a;
	int b;
	
	public Shop(int a, int b) {
		this.a = a;
		this.b = b;
	}
}