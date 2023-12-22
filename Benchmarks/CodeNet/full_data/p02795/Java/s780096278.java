import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		int beggerVal = 0;
		if(h < w) {
			beggerVal = w;
		}else {
			beggerVal = h;
		}
		
		if(n % beggerVal == 0) {
			System.out.println(n/beggerVal);
		}else {
			System.out.println(n/beggerVal + 1);
		}
	}

}
