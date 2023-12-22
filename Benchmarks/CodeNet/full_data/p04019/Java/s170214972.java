import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		
		boolean[] d = new boolean[4];
		for(int i=0; i<s.length; i++)
			d["NWSE".indexOf(s[i])] |= true;
		
		System.out.println((d[0]^d[2])||(d[1]^d[3]) ? "No" : "Yes");
		
		sc.close();
	}
}
