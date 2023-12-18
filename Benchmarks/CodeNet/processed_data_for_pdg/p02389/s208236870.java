public class Main {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		int b=kb.nextInt();
		System.out.printf("%d %d\n", a*b,(a+b)*2);
		kb.close();
	}
}
