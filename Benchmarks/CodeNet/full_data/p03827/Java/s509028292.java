import java.util.*;
public class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		String str=s.next();
		int cur=0,max=0;
		for(int i=0;i<str.length();i++) {
			switch (str.charAt(i)) {
			case 'D':
				cur--;
				break;
			case 'I':
				cur++;
				break;
			}
			max=Math.max(cur, max);
		}
		System.out.println(max);
	}
}
