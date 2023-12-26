public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String ans = "";
		for(int i = 0; i < n.length(); i++){
			if(n.charAt(i) == '1') ans += "9";
			else if(n.charAt(i) == '9') ans += "1";
			else ans += n.charAt(i);
		}
		System.out.println(ans);
	}
}
