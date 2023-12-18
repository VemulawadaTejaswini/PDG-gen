public class Main {
	public static Scanner sc;
	public static void main(String args[]){
		int a,b;
		int S,L;
		sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		S=a*b;
		L=2*(a+b);
		System.out.println(S+" "+L);
	}
}
