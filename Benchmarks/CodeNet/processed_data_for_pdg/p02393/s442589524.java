public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int temp;
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		} 
		if(b>c) {
			temp = b;
			b = c;
			c = temp;
		}
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		} 
		System.out.println(a+" "+b+" "+c);
	}
}
