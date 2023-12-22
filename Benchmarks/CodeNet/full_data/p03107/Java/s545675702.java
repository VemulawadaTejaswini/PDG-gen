import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int l = str.length();
		int l1=0;
		for(int i=0;i<l;i++) {
			l1 += str.charAt(i) =='1' ? 1 : 0;
		}
		System.out.println(l-Math.abs(l-2*l1));
	}

}
