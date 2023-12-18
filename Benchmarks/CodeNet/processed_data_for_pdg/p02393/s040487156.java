public class Main
{
	public static void main(String args[])
	{
		int a, b, c, t;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if(a > b){
			t = a;
			a = b;
			b = t;
		}
		if(b > c){
			t=b;
			b=c;
			c=t;
		}
		if(a > b){
			t = a;
			a = b;
			b = t;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
