import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String a = "CODEFESTIVAL2016";
		int len = s.length();
		int ans = 0;
		for(int i=0; i<len; i++){
			if(s.charAt(i) == a.charAt(i)){
				ans++;
			}
		}
		System.out.println(ans);
	}

}