import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		String[] a = new String[w];
		for(int n = 0; n < h;n++) {
			a[n] = sc.next();
		}
		
		for(int x = 0; x < w+2; x++) {
			System.out.print("#");
		}
		System.out.println("");
		
		for(int n = 0; n < h; n++) {	
			System.out.print("#");
				System.out.print(a[n]);
			System.out.println("#");
		}
		
		for(int x = 0; x < w+2; x++) {
			System.out.print("#");
		}
		
	}

}