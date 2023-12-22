import java.util.Scanner;

public class Main {

	static String s;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		System.out.println(reverse(s));
		
	}
	
	public static int reverse(String st) {
		String[] t = st.split("");
		int c = 0;
		boolean can = false;
		for(int i=0; i<t.length-1; i++) {
			if(t[i].equals("B") && t[i+1].equals("W")) {
				t[i] = "W";
				t[i+1] = "B";
				c++;
			}
		}
		for(int i=0; i<t.length-1; i++) {
			if(t[i].equals("B") && t[i+1].equals("W")) {
				can = true;
			}
		}
		if(can) {
			StringBuilder sb = new StringBuilder();
			for (String string : t) {
				sb.append(string);
			}
			c += reverse(new String(sb));
		}
		return c;
	}

}
