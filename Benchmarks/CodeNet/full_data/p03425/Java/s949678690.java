import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int a[]= new int[5];
		char c[] = {'M','A','R','C','H'};
		long sum =0;
		for (int i =0;i<N;i++) {
			String str = sc.next();
			for (int j=0;j<c.length;j++) {
				if (str.charAt(0)==c[j]) {
					a[j] ++;
					break;
				}
			}
		}
		sum +=Main.count(a[0], a[1], a[2]);
		sum +=Main.count(a[0], a[1], a[3]);
		sum +=Main.count(a[0], a[1], a[4]);
		sum +=Main.count(a[0], a[2], a[3]);
		sum +=Main.count(a[0], a[2], a[4]);
		sum +=Main.count(a[0], a[3], a[4]);
		sum +=Main.count(a[1], a[2], a[3]);
		sum +=Main.count(a[1], a[2], a[4]);
		sum +=Main.count(a[1], a[3], a[4]);
		sum +=Main.count(a[2], a[3], a[4]);
	}
	private static long count(int a,int b,int c) {
		return a*b*c;
	}
}