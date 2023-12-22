import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		
		int len = S.length();
				
		int left = 0, right = 0;
		int addLeft = 0, addRight = 0;
		for(int i=0;i<len;i++) {
			if(S.charAt(i)=='(') {
				left++;
			}else {
				right++;
			}
			int leftLack = Math.max(0,right - left);
			addLeft += leftLack;
			left += leftLack;
		}
		
		addRight = Math.max(0, left-right);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<addLeft;i++) {
			sb.append('(');
		}
		sb.append(S);
		for(int i=0;i<addRight;i++) {
			sb.append(')');
		}		
		
		System.out.println(sb.toString());
	}
}
