import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		String[] picLines = new String[h];
		
		for(int i=0; i<picLines.length; i++) {
			picLines[i] = sc.nextLine();
		}
		
		sc.close();
		
		// printout
		paint(w);
		
		for(int i=0; i<picLines.length; i++) {
			System.out.print("#");
			System.out.print(picLines[i]);
			System.out.println("#");
		}
		
		paint(w);
		

	}
	
	public static void paint(int w) {
		for(int i=0; i<w+2; i++) {
			System.out.print("#");
		}
		System.out.println();
	}
	

}