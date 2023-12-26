public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0' || s.charAt(i)=='1') {
				ans += s.charAt(i);
			}else {
				if(ans.length()!=0) {
					ans = ans.substring(0,ans.length()-1);
				}
			}
		}
		System.out.println(ans);
	}
}
