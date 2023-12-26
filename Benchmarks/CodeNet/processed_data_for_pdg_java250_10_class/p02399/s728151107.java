public class Main {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int num1 = (int)a/b;
		int num2 = (int)a%b;
		double num3 = (double)a/(double)b;
		System.out.printf("%d %d %f",num1,num2,num3);
		sc.close();
	}
}
