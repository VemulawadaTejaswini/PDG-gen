public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num ;
		if(a>b){
			num = b;
			b = a;
			a = num;
		}
		if(b>c){
			num = c;
			c = b;
			b = num;
		}
		if(a>b){
			num = b;
			b = a;
			a = num;
		}
		System.out.println(a+" "+b+" "+c);
	}
}
