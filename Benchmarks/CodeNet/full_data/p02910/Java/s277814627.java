import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String t=null;
		for(int i=0;i<s.length();s+=2) {
			if((s.charAt(i)==('R'|'U'|'D'))&&(s.charAt(i+1)==('L'|'U'|'D'))) {
				t="Yes";
			}else  {
				t="No";
			}
			
		}
		System.out.print(t);
	}
}