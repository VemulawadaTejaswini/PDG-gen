import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int blue = sc.nextInt();
		int red = sc.nextInt();
		
		int s = n / (blue + red);
		int k = n - s * (blue + red);
		
		if(k >= blue) {
			System.out.println(blue * (s + 1));
		}else {
			System.out.println(blue * s + k);
		}
	}
	
}
