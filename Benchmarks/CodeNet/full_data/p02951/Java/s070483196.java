import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int baketu = 0;
		int mizu = 0;
		
		if (a <= 20 && b <= a && c <= 20) {
				baketu = a - b;
				mizu = c - baketu;
			}
			System.out.println(mizu);
	 }
}