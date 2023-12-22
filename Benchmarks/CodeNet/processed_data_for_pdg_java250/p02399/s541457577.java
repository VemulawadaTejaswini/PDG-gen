public class Main{
	public static void main(String[] args){
		int a, b, d, r;
		double f;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(1<=a && a <=Math.pow(10, 9)){
			d = a/b;
			r = a%b;
			f = (double)a/b;
			System.out.print(d+" "+r+" ");
			System.out.printf("%f\n",(double)f);
		}
	}
}
