import java.util.Scanner;

public class Main {
	
	private static final String YES = "YES";
	private static final String NO = "NO";

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N1 = sc.nextInt();
		final int N2 = sc.nextInt();
		final int N3 = sc.nextInt();
		final int N4 = sc.nextInt();
		
		boolean [] b = new boolean[10];
		
		b[N1] = true;
		b[N2] = true;
		b[N3] = true;
		b[N4] = true;
		
		if(b[1] && b[9] && b[7] && b[4]) {
			System.out.println(YES);
		}else {
			System.out.println(NO);
		}
		
		sc.close();
	}


}
