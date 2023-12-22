import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int w = s.nextInt();
		
		String n = "", nn = "";
		for(int i = 0; i < w + 2; i++) n += "#";
		System.out.println(n);
		
		for(int i = 0; i < h; i++) {
			nn = s.next();
			System.out.println("#" + nn + "#");
		}
		System.out.println(n);
	}
}
