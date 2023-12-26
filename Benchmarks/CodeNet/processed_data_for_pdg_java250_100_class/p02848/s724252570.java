public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String org = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String con;
		String t = "";
		if ( n == 0 || n == 26 ) {
			System.out.println(s);
		} else {
			con = org.substring(n);
			con = con.concat(org.substring(0,n));
			for ( int i = 0 ; i < s.length() ; i++ ) {
				String c = String.valueOf(s.charAt(i));
				int ps = org.indexOf(c);
				t = t.concat(String.valueOf(con.charAt(ps)));
			}
			System.out.println(t);
		}
	}
}
