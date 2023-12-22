import java.util.Scanner;

// https://atcoder.jp/contests/code-festival-2016-qualb/tasks/codefestival_2016_qualB_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		sc.close();

		String[] array = s.split("");

		int tmp_fore = 1;
		int tmp = 0;

		for(int i=0;i<n;i++) {
			if(array[i].equals("a")) {
				if(a+b>tmp) {
					System.out.println("Yes");
					tmp++;
				}else {
					System.out.println("No");
				}
			}else if(array[i].equals("b")) {
				if(a+b>tmp) {
					if(b>=tmp_fore) {
						System.out.println("Yes");
						tmp++;
						tmp_fore++;
					}else {
						System.out.println("No");
					}
				}else {
					System.out.println("No");
				}
			}else {
				System.out.println("No");
			}

		}
	}
}
