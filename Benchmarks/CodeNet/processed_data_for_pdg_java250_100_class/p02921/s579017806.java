public class Main {
	public static void main(String[] args) {
		String a,b;
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		b = sc.next();
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i)==b.charAt(i))
				cnt++;
		}
		System.out.println(cnt);
	}
}
