import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean flag = true;
		String[] D = S.split("hi");
		for(int i = 0; i < D.length; i++) {
			if(D[i]!="")flag = false;
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}