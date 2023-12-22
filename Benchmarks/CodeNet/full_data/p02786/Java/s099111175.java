import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long count = 1;
		
		for(Long i = H; i != 1; i = i/2){
			count = count + count * 2;
		}
		
		System.out.println(count);
	}
}