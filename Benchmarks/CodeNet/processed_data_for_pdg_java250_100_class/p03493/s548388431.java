public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int cnt = 0;
		String[] s = stdIn.next().split(""); 
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("1")) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
