public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		int x;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if(a > b){
			x = b;
			b = a;
			a = x;
		}
		if(b > c){
			x = c;
			c = b;
			b = x;
		}
		if(a > b){
			x = b;
			b = a;
			a = x;
		}
		if(b > c){
			x = c;
			c = b;
			b = x;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
