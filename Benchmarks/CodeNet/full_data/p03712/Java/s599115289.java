import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int height = sc.nextInt();
		final int width = sc.nextInt();
		
		String SHARP = "#";
		// create header
		System.out.println(createHeaderFooter(width, SHARP));
		
		// 
		String line = sc.nextLine();
		for( int i = 0; i < height ; i++ ){
			line = sc.nextLine();
			System.out.println(SHARP + line + SHARP);
		}
		
		System.out.println(createHeaderFooter(width, SHARP));
		
	}

	private static String createHeaderFooter(final int width, String SHARP) {
		StringBuilder sb = new StringBuilder();
		for( int i = 0; i <= width + 1 ; i++ ){
			sb.append(SHARP);
		}
		return sb.toString();
	}

}
