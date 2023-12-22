
//不能简单的判断原串相等，后面也得子串和子串
//旋转必定在最后
//abaaabaa与baaabaaa
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		int k = 0;
		int j = 0;
		if(S.equals(T)) {
			System.out.println("Yes");
		}else {
			for (int i = 0; i <= S.length(); i++) {
				String a = S.substring(0, i);
				if(!T.contains(a)) {
					j = i - 1;
					k = T.lastIndexOf(a.substring(0,i-1));
					break;
				}
			}
			if(k==0||k==-1) {
				System.out.println("No");
			}else {
				//System.out.println(T.substring(0,k));
				//System.out.println(S.substring(j,S.length()-1));
				if(T.substring(0,k).equals(S.substring(j,S.length()))) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
		
		
		
	}

}
