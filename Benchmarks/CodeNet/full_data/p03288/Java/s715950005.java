import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = {"ABC", "ARC", "AGC"};
		int r = Integer.parseInt(sc.next());
		
		System.out.println(r);
		System.out.println(r/50);
		System.out.println(r/50+8);
		System.out.println(r/50+8>>5);

		System.out.println(names[r/50+8>>5]);

//		if (r < 1200){
//			System.out.println("ABC");
//		}else if (r < 2800){
//			System.out.println("ARC");
//		}else {
//			System.out.println("AGC");
//		}
	}
}
