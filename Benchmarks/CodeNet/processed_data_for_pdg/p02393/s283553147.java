public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d;
		if(a>c){
			d = a;
			a = c;
			c = d;
		}
		if(b>c){
			d = b;
			b = c;
			c = d;
		}
		if(a>b){
			d = a;
			a = b;
			b = d;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
