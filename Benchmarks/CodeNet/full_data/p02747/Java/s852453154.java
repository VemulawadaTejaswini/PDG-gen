import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		if(s.length % 2 ==1) {
			System.out.println("No");
			return;
		}
		for(int i = 0;i <s.length;i++) {
			if(i %2 == 1) {
				if(!s[i].equals("i")) {
					System.out.println("No");
					return;
				}
			}else {
				if(!s[i].equals("h")) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}