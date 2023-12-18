public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
		int o,p,q;
		if(a<=b && a<=c) {
			o=a;p=b;q=c;
		}
		else if(c<=b && c<=a) {
			o=c; p=a; q=b;
		}
		else {
			o=b; p=a; q=c;
		}
		if(p<q)System.out.printf("%d %d %d\n", o,p,q);
		else System.out.printf("%d %d %d\n", o,q,p);
	}
}
