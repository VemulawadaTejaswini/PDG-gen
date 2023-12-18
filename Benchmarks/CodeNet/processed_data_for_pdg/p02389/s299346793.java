public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c,d;
		c=a*b;
		d=2*(a+b);
		System.out.println(c+" "+d);
		scan.close();
	}
}
