public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int max, midle, min;
		while(a < 1 || a > 10000 || b < 1 || b > 10000 || c < 1 || c > 10000) {
			a = stdIn.nextInt();
			b = stdIn.nextInt();
			c = stdIn.nextInt();
		}
		if(a < b && a < c) {
			min = a;
			if(b < c) {
				midle = b;
				max = c;
			}else {
				midle = c;
				max = b;
			}
		}else if(b < c) {
			min = b;
			if( a < c) {
				midle = a;
				max = c;
			}else {
				midle = c;
				max = a;
			}
		}else {
			min = c;
			if( a < b) {
				midle = a;
				max = b;
			}else {
				midle = b;
				max = a;
			}
		}
		System.out.println(min + " " + midle + " " + max);
	}
}
