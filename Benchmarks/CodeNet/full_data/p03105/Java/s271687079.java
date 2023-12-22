import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte[] abc = new byte[3];
		
		for (int i = 0; i < abc.length; i++) {
			abc[i] = sc.nextByte();
		}
		
		int count = 0;
		
		while (abc[0] <= abc[1] && count < abc[2]) {
			abc[1] -= abc[0];
			++count;
		}
		
		System.out.println(count);
	}
}
