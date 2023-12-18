public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int z;
		for(int i=0; i<9; i++) {
			if(a>b) {
				z=a;
				a=b;
				b=z;
			}
			if(b>c) {
				z=b;
				b=c;
				c=z;
			}
		}
		System.out.println(a+" "+b+" "+c);
	}
}
