public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String s = stdin.next();
		int a=0;
		char[] c;
		c = s.toCharArray();
		for(int i=0;i<4;i++) {
			if(c[i]=='+') {
				a++;
			}else {
				a--;
			}
		}
		System.out.println(a);
	}
}
