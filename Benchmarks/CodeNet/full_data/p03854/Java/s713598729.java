import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
      	String[] strs = {"dream","dreamer","erase","eraser"};
		while(true) {
			boolean endWithstr = false;
			for(String str:strs) {
				if(s.endsWith(str)) {
					endWithstr = true;
					s = s.substring(0,s.length()-str.length());
					break;
				}
			}
			if(!endWithstr) {
				System.out.println("NO");
				break;
			}
			if(s.length()<=0) {
				System.out.println("YES");
				break;
			}
		}
	}

}