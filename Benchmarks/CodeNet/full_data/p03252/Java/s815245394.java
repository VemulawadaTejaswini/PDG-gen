import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		String ans="Yes";
		for(int i = 0; i < s.length(); i++)
			//ある文字がそれ以降再度出てくる時、その位置関係が対等なら置換可能
			//例1では2文字目に出てきた文字が3文字目にも出てくるという状況がs1,s2共に起こり、それ以外の文字は重複しない
			if(s.indexOf(s.charAt(i), i+1) != t.indexOf(t.charAt(i), i+1)) {
				ans="No";break;
			};
		System.out.println(ans);
	}
}