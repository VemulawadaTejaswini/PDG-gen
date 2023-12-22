import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();
		
		int[] cardArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			cardArr[i] = sc.nextInt();
		}
		sc.close();
		
		if(cardArr.length == 1) {
			System.out.println(Math.abs(cardArr[0] - w));
			return;
		}
		
		
		int tail = cardArr[cardArr.length - 1];
		int semiTail = cardArr[cardArr.length - 2];
		
		if(Math.abs(tail - w) > Math.abs(tail - semiTail)) {
			System.out.println(Math.abs(tail - w));
		}else {
			System.out.println(Math.abs(tail - semiTail));
		}
	}
}
