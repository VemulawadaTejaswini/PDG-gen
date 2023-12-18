public class Main {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		try(Scanner scanner=new Scanner(System.in)){
			a=scanner.nextInt();
			b=scanner.nextInt();
		}
		if(a >= 1 && b<=100) {
		System.out.print(a*b + " ");
		System.out.println(2*a+2*b);
		}
	}
}
