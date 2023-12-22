import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n  = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		String s = scan.next();

		int count = 0;
		int count_b = 0;

		char[] c = s.toCharArray();

		int [] d = new int [n];

		for(int i=0;i<n;i++) {

			if(c[i]=='a') {
				if(count<(a+b)) {
					d[i] = 1;
					count++;
				}
			}else if(c[i]=='b') {
				if(count<(a+b)&&count_b<b) {
					d[i] = 1;
					count++;
					count_b++;
				}
			}

			if(d[i]==1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
