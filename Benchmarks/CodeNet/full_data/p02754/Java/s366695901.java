import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int all = scan.nextInt(), blue = scan.nextInt(), red = scan.nextInt();
		int count = 0;
		
		for(int i = 0; i < all; i++) {
			if((i + 1) % (blue + red)  <= blue && (i + 1) % (blue + red) != 0) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
	
}
