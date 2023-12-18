public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int change;
		if(a > b){
			change = a;
			a = b;
			b = change;
		}
		if(b > c){
			change = b;
			b = c;
			c = change;
		}
		if(a > b){
			change = a;
			a = b;
			b = change;
		}
		System.out.println(a +" "+b+" "+c);
	}
}
