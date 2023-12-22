import java.util.Scanner;

public class　Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String sd = scan.next();
		String t = scan.next();
		scan.close();
		
		for(int i = 0; i < sd.length(); i++) {
			for(int j = 0; j < t.length() && i+j < sd.length(); j++) {
				if(sd.charAt(i+j)!=t.charAt(j) && sd.charAt(i+j)!='?') break;
				
				if(j == t.length()-1) {
					System.out.println(makeS(sd,t,i));
					return;
				}
			}
		}
		
		System.out.println("UNRESTORABLE");
	}

	public static String makeS(String sd, String t, int i) {
		System.out.println(t);
		
		char[] ans = new char[sd.length()];
		for(int j = 0; j < i; j++)
			ans[j] = sd.charAt(j) == '?' ? 'a' : sd.charAt(j);
		
		for(int j = 0; j < t.length(); j++) 
			ans[i+j] = t.charAt(j);
		
		for(int j = t.length()+i; j < sd.length(); j++)
			ans[j] = sd.charAt(j) == '?' ? 'a' : sd.charAt(j);
		
		return new String(ans);
	}
}
