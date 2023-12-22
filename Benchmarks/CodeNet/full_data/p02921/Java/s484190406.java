import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		String n = scan.nextLine();
		String m = scan.nextLine();

		char[] a = n.toCharArray();
		char[] b = m.toCharArray();

		int total = 0;

		for(int i=0;i<3;i++) {
			if(a[i]==b[i]) {
				total+=1;
			}
		}

		System.out.println(total);

	}

}