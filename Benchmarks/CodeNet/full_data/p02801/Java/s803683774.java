import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		
		System.out.println((char)(((int)c[0])+1));
		
		sc.close();
	}

}
