import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();
		String r = "";
		char t = s[0];
		for(int i=1;i<n;i++){
			if(t == s[i]) continue;
			r += t;
			t = s[i];
		}
		System.out.println(r.length()+1);
	}
}
