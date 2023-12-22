import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		String s[] =new String[6];
		for(int i=0;i<s.length;i++) {
			s[i]=scan.next();
			if(s[2]==s[3]&&s[4]==s[5]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
