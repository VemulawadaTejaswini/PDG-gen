import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int depth=0;
		int mindepth=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='(') {
				depth++;
			}
			else {
				depth--;
			}
			if(mindepth>depth) {
				mindepth=depth;
			}
		}
		
		StringBuilder ans=new StringBuilder();
		for(int i=mindepth; i<0;i++) {
			ans.append('(');
		}
		ans.append(s);
		for (int i=0;i<depth-mindepth;i++) {
			ans.append(')');
		}
		System.out.println(ans);
	}

}
