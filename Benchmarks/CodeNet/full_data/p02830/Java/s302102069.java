import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		String c = sc.next();
		String ans = "";
		int i = 1;
		while(true) {
			ans += b.substring(i-1,1);
			ans += c.substring(i-1,1);
			i++;
			if(a==i) {break;}
		}
		System.out.println(ans);
	}
}
