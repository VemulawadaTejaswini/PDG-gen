public class Traveling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,sum;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sum = a+c;
		if(a+d < sum)sum = a+d;
		if(b+c < sum)sum = b+c;
		if(b+d < sum)sum = b+d;
		System.out.println(sum);
	}
