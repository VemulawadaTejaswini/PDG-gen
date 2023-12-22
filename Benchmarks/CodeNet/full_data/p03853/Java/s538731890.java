import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		String[] c = new String[h * 2];
		for (int i = 0; i < c.length; i += 2)
			c[i] = c[i + 1] = sc.next();
		
		for (String s : c)
			System.out.println(s);
		
		sc.close();
	}
	
}


