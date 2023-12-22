import java.util.Scanner;

/**
 * https://abc059.contest.atcoder.jp/tasks/abc059_b
 */
public class Main {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
	
		String ans=null;
		if(a.equals(b)){
			ans = "EQUAL";
		}else if(a.length() > b.length() ){
			ans = "GREATER";
		}else if( a.length() < b.length() ){				
			ans = "LESS";
		}else {
			ans = a.compareTo(b)>0 ? "GREATER" : "LESS";
		}
		
		System.out.println(ans);
 
	}
 
}