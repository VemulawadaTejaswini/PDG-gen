import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		sc.close();
		
		String ans = "NO";
		if(a.charAt(a.length()-1) == b.charAt(0) && 
				b.charAt(b.length()-1) == c.charAt(0)){
			ans = "YES";
		}
	
		//出力
		System.out.println(ans);

	}

}