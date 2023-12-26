public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for(int i = 0; i < n ; i++) {
			String s = sc.next();
			if(s.equals("AC")) {
				a++;
			}else if (s.equals("WA")) {
				b++;
			}else if (s.equals("TLE")) {
				c++;
			}else {
				d++;
			}
		}
		System.out.println("AC x "+ a);
		System.out.println("WA x "+ b);
		System.out.println("TLE x "+ c);
		System.out.println("RE x "+ d);
	}
}
