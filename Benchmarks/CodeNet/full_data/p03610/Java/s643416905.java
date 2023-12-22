import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = 0;
		String[] rs = new String[100];
		String s = scan.next();
		String[] str = s.split("");
		for(int i = 0; i < str.length; i++) {
			if(i % 2 == 0) {
				rs[k] = str[i];
				k++;
			}
		}
		String[] last = new String[k];
		for(int i = 0; i < k; i++) {
			last[i] = rs[i];
		}
		System.out.println(String.join("", last));
		scan.close();
	}
}