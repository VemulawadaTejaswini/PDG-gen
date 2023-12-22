
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		double ans = (double)w*(double)h/2;
		boolean jdg = false;
		if(w/2 == x && h/2 == y) {
			jdg = true;
		}
		System.out.print(ans);
		System.out.print(" "); 
		if(jdg) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
	}


}
