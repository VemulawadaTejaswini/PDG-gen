import java.util.Scanner;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		Main main = new Main();
		String s= sc.next();
		for (int i=0;i<s.length();i++) {
			a[i]=main.char2Int(s.charAt(i));
		}
//		for (int i=0;i<N;i++) {
//			for (int j=1;j<N-i;j++) {
//				a[j-1]=Math.abs(a[j]-a[j-1]);
//			}
//		}
		int odd=0;
		int c=0;
		for (int i=0;i<N;i=i+2) {
			odd +=a[i];
		}
		for (int i=1;i<N;i=i+2) {
			c +=a[i];
		}
		System.out.println(Math.abs(odd-c)%3);
	}
	private int char2Int (char a) {
		return a-'0';
	}

}