import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text=sc.next();
		char word[]=new char[text.length()];
		for(int i=0;i<text.length();i++) {
			word[i]=text.charAt(i);
		}
		sc.close();
		for(int i=0;i<text.length();i++) {
			if(word[i]=='B'&&i!=0) {
				word[i-1]='B';
			}
		}
		for(int i=0;i<text.length();i++) {
			if(word[i]=='0'||word[i]=='1') {
				System.out.print(word[i]);
			}
		}
	}
}