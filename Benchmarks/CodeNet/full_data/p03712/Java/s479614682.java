import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] a = new String[H];
		for(int i = 0 ; i < H ; i++) {
			a[i] = sc.next();
		}
		for(int i = 0 ; i < W + 2 ; i++) {
			System.out.print("#");
		}
		System.out.println();
		for(int i = 0 ; i < H ; i++) {
			System.out.print("#");
			System.out.print(a[i]);
			System.out.println("#");
		}
		for(int i = 0 ; i < W + 2 ; i++) {
			System.out.print("#");
		}
		System.out.println();
	}
}