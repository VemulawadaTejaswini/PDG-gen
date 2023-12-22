import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[] = sc.next().split("");
		String b[] = sc.next().split("");
		
		int cnt = 0;
		for (int i = 0 ; i < a.length ; i++) {
			if(a[i].equals(b[i])) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}
}