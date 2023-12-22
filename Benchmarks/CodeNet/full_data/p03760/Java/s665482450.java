import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String o = sc.nextLine();
		String e = sc.nextLine();
		
		System.out.println(mekePw(o,e));
		
		

	}
	
	static String mekePw(String o, String e) {
		StringBuilder pw = new StringBuilder();
		int l = o.length()+e.length();
		int counto = 0,counte = 0;
		for(int i=1; i<=l; i++) {
			if(i%2==0) {
				pw.append(e.charAt(counte));
				counte += 1;
			}else {
				pw.append(o.charAt(counto));
				counto += 1;
			}
		}
		
		return pw.toString();
		
	}

}
