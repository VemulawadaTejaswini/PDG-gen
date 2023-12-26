public class Main {
	public static void  main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a/b);
		System.out.println(a%b);
		double f = (double)a/b;
		System.out.printf("%f\n",f);
	}
}
