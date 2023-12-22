import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] s = new String[H];
		System.out.println();
		for(int i = 0; i < H; i++) {
			s[i] = sc.next();
		}
		for(int i = 0; i < W + 2; i++) {
			System.out.print("#");
		}
		System.out.println();
		for(int i = 0; i < H; i++) {
				System.out.print("#");
				System.out.print(s[i]);
				System.out.print("#");
				System.out.println();
		}
		for(int i = 0; i < W + 2; i++) {
			System.out.print("#");
		}
	}

}
