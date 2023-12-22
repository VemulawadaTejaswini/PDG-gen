import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		
		int nyannyan = X - A;
		if(nyannyan < 0 || B < nyannyan)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
