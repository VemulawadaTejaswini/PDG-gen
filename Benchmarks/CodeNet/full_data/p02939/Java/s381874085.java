import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String judge = "";
		String temp = "";
		int ans = 0;
		for(int i = 0; i < s.length(); i++) {
			temp += s.substring(i,i+1);
			if(temp.equals(judge)) {
				continue;
			}
			else {
				judge = temp;
				temp = "";
				ans++;
				System.out.println(judge);
			}
		}
		System.out.println(ans);
	}
}